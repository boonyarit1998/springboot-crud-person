package com.example.springBootCRUD.repository;

import com.example.springBootCRUD.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {
}
