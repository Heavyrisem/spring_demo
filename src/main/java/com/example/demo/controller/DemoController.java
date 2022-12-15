package com.example.demo.controller;

import com.example.demo.dto.CreateDemoDto;
import com.example.demo.entity.Demo;
import com.example.demo.service.DemoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("/demo")
public class DemoController {
    private final DemoService demoService;

    @GetMapping("/text")
    public String getDemoText() {
        return this.demoService.getDemoString();
    }

    @GetMapping("/{id}")
    public Optional<Demo> getDemoById(@PathVariable Integer id) {
        return this.demoService.findDemoById(id);
    }

    @PostMapping("/")
    public Demo createDemo(@RequestBody @Valid CreateDemoDto createDemoDto) {
        return this.demoService.createDemo(createDemoDto);
    }
}
