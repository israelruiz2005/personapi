package com.github.israelruiz2005.personapi.repository;

import com.github.israelruiz2005.personapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
