package com.example.validation.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class SignUpDto {
    @NotBlank(message = "This field is required")
    @Size(min = 3, max = 10, message = "User Name contains 3-10 characters")
    @UserNameUnique
}
