package com.exapmle.demo.service.impl;

import com.exapmle.demo.dto.UserDTO;
import com.exapmle.demo.model.UserModel;
import com.exapmle.demo.ripository.UserRipository;
import com.exapmle.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UserRipository userRipository;

    @Override
    public String saveModel(UserDTO userDTO) {
        UserModel usr = new UserModel();
        usr.setName(userDTO.getName());
        usr.setAddress(userDTO.getAddress());
        usr.setAge(userDTO.getAge());
        usr.setGender(userDTO.getGender());
        userRipository.save(usr);

        return "saved";

    }

    @Override
    public String deleteModel(int id) {
        userRipository.deleteById(id);
        return "deleted";
    }
}
