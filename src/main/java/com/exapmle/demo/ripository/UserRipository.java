package com.exapmle.demo.ripository;

import com.exapmle.demo.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRipository extends JpaRepository<UserModel,Integer> {
}
