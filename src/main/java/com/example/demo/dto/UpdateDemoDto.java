package com.example.demo.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@Data
@Getter
@NoArgsConstructor
public class UpdateDemoDto {
    @NotEmpty
    private String text;
}
