package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "demo")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class Demo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, nullable = false, name = "id")
    private Integer id;

    @Column(nullable = false, name = "text")
    private String text;
}