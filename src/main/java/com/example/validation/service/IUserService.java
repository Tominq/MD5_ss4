package com.example.validation.service;

import com.example.validation.dto.request.SignInDto;
import com.example.validation.dto.request.SignUpDto;
import com.example.validation.dto.response.UserResponse;
import com.example.validation.exception.UserNameAndPasswordException;

public interface IUserService {
    UserResponse login(SignInDto signInDto) throws UserNameAndPasswordException;

    void register(SignUpDto signUpDto);

    boolean existByUserName(String username);

    boolean existByEmail(String email);

    boolean existByPhone(String phone);

}
