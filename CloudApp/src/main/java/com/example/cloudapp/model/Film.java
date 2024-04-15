package com.example.cloudapp.model;

import lombok.*;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import java.util.UUID;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "sv_43_2021")
public class Film {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Title",nullable = false)
    private String title;
    @Column(name = "Genre",nullable = false)
    private String genre;
    @Column(name = "Year",nullable = false)
    private int year;


}
