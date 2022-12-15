package com.example.demo.service;

import com.example.demo.dto.CreateDemoDto;
import com.example.demo.entity.Demo;
import com.example.demo.repository.DemoRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Slf4j
@Service
@AllArgsConstructor
public class DemoService {
    private final DemoRepository demoRepository;

    public String getDemoString() {
        return "Hello Demo!";
    }

    public Optional<Demo> findDemoById(Integer id) {
        return this.demoRepository.findById(id);
    }

    @Transactional
    public Demo createDemo(CreateDemoDto createDemoDto) {
        Demo demo = Demo.builder().text(createDemoDto.getText()).build();
        return this.demoRepository.save(demo);
    }
}
