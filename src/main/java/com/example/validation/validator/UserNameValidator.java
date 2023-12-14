package com.example.validation.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import com.example.validation.service.IUserService;

@Component
@RequiredArgsConstructor
public class UserNameValidator implements ConstraintValidator<UserNameUnique, String> {
    private final IUserService userService;

    @Override
    public boolean isValid(String username, ConstraintValidatorContext constraintValidatorContext) {
        return !userService.existByUserName(username);
    }
}
