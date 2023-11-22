package com.hobbyloop.domain.example.repository;

import com.hobbyloop.domain.example.entity.Example;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExampleRepository extends JpaRepository<Example, Long> {
}
