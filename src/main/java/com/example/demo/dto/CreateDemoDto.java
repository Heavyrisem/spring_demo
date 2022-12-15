package com.example.demo.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
@Getter
@NoArgsConstructor
public class CreateDemoDto implements Serializable {
    @NotEmpty
    private String text;
}
