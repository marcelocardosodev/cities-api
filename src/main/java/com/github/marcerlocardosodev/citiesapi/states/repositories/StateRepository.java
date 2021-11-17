package com.github.marcerlocardosodev.citiesapi.states.repositories;

import com.github.marcerlocardosodev.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
