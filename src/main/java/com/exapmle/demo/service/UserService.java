package com.exapmle.demo.service;

import com.exapmle.demo.dto.UserDTO;

public interface UserService {

    String saveModel(UserDTO userDTO);

    String deleteModel(int id);
}
