package com.cifnews.train.repository;

import com.cifnews.train.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by SuperS on 2017/9/25.
 *
 * @author SuperS
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
