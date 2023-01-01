package com.codegate01.vaccovid.service;

import com.codegate01.vaccovid.entities.Country;
import com.codegate01.vaccovid.rapidapi.Vaccovid;
import com.codegate01.vaccovid.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class CountryService {

    @Autowired
    private Environment environment;

    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getCountriesRepository() throws IOException {
        String apiKey = environment.getProperty("X-RapidAPI-Key");
        String apiHost = environment.getProperty("X-RapidAPI-Host");
        String countriesEndPoint = environment.getProperty("countries-data-endpoint");

        Vaccovid vaccovid = new Vaccovid();
        List<Country> countriesData = vaccovid.getCountriesData(countriesEndPoint, apiKey, apiHost);
        countryRepository.saveAll(countriesData);
        return countriesData;
    }
}
