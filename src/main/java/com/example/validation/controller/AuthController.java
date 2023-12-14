package com.example.validation.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.validation.dto.request.SignInDto;
import com.example.validation.dto.request.SignUpDto;
import com.example.validation.dto.response.UserResponse;
import com.example.validation.exception.UserNameAndPasswordException;
import com.example.validation.service.IUserService;

@RestController
@RequestMapping("api.authentication.com/v1")
@RequiredArgsConstructor
public class AuthController {
    private final IUserService userService;

    @PostMapping("/sign-in")
    public ResponseEntity<UserResponse> signin(@Valid @RequestBody SignInDto signInDto) throws UserNameAndPasswordException {
        return new ResponseEntity<>(userService.login(signInDto), HttpStatus.OK);
    }

    @PostMapping("/sign-up")
    public ResponseEntity<String> register(@Valid @ModelAttribute SignUpDto signUpDto) {
        userService.register(signUpDto);
        return new ResponseEntity<>("Đăng kí thành công", HttpStatus.CREATED);
    }
}
