package com.cifnews.train;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationDetails;


@EnableEurekaClient
@EnableFeignClients
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableGlobalMethodSecurity(prePostEnabled = true)
@SpringBootApplication
public class OrderServiceApplication {
	//Feign 访问内部服务时添加 鉴权头
	@Bean
	public RequestInterceptor requestTokenBearerInterceptor() {

		return new RequestInterceptor() {

			@Override
			public void apply(RequestTemplate requestTemplate) {

				OAuth2AuthenticationDetails details = (OAuth2AuthenticationDetails)

						SecurityContextHolder.getContext().getAuthentication()
								.getDetails();

				requestTemplate.header("Authorization",
						"bearer " + details.getTokenValue());

			}

		};

	}
	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}
}
