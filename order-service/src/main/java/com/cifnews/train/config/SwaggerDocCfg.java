package com.cifnews.train.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;


/**
 * Copyright (c) 2017-present, Demart Corporation.
 * All rights reserved.
 * <p/>Created by demartworld on 17/2/12.
 */
@Configuration
@EnableSwagger2
public class SwaggerDocCfg extends WebMvcConfigurerAdapter{

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("ServiceMall on Cifnews")
            .description("WebMall api v1.0")
            .license("")
            .licenseUrl("http://www.cifnews.com")
            .termsOfServiceUrl("")
            .version("1.0.0")
            .contact(new Contact("", "", ""))
            .build();
    }

    /**
     * Build custom implement docket.
     *
     * @return docket
     */
    @Bean
    public Docket customImplementation() {
        return new Docket(DocumentationType.SWAGGER_2)
            .select()
            .paths(regex("/orders.*"))
            .build()
            .directModelSubstitute(org.joda.time.LocalDate.class, java.sql.Date.class)
            .directModelSubstitute(org.joda.time.DateTime.class, java.util.Date.class)
            .apiInfo(apiInfo());
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");

        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

}