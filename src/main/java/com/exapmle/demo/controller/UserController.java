package com.exapmle.demo.controller;

import com.exapmle.demo.dto.UserDTO;
import com.exapmle.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("api/v1/user")
public class UserController {

    @Autowired
    public UserService userService;

    @PostMapping("/save")
    public String saveUser(@RequestBody UserDTO userDTO){
        return userService.saveModel(userDTO);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id){
        return userService.deleteModel(id);
    }
}
