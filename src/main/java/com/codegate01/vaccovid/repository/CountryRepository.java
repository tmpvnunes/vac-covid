package com.codegate01.vaccovid.repository;

import com.codegate01.vaccovid.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CountryRepository extends JpaRepository <Country, Long> {
    List<Country> getCountryByThreeLetterSymbolAndCountry(String iso, String countryName);
}
