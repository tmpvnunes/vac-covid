package com.codegate01.vaccovid.repository;

import com.codegate01.vaccovid.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository <Country, Long> {
}
