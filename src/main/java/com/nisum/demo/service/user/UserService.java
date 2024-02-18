package com.nisum.demo.service.user;


import com.nisum.demo.dto.response.UserDTO;
import com.nisum.demo.dto.request.LoginRequest;
import com.nisum.demo.dto.request.UserRequest;

import java.util.List;

public interface UserService {
    UserDTO register(UserRequest request);

    UserDTO login(LoginRequest request);

    List<UserDTO> getAllUsers();

    UserDTO getUserByUUID(String uuid);
}
