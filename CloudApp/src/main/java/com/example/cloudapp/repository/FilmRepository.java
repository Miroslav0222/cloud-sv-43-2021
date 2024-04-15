package com.example.cloudapp.repository;

import com.example.cloudapp.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface FilmRepository extends JpaRepository<Film, Integer> {
}
