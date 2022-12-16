package com.example.demo.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "demo")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Demo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, nullable = false, name = "id")
    private Integer id;

    @Column(nullable = false, name = "text")
    private String text;
}