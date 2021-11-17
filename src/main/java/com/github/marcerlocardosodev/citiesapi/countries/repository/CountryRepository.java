package com.github.marcerlocardosodev.citiesapi.countries.repository;

import com.github.marcerlocardosodev.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
