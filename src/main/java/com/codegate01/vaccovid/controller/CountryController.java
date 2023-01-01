package com.codegate01.vaccovid.controller;

import com.codegate01.vaccovid.entities.Country;
import com.codegate01.vaccovid.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class CountryController {

    @Autowired
    CountryService countryService;

    @GetMapping("countries")
    public List<Country> getCountryData() throws IOException {
        return countryService.getCountriesRepository();
    }
}
