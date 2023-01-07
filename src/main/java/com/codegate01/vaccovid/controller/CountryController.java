package com.codegate01.vaccovid.controller;

import com.codegate01.vaccovid.entities.Country;
import com.codegate01.vaccovid.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class CountryController {

    @Autowired
    CountryService countryService;

    @GetMapping("countries")
    public List<Country> getCountriesData() throws IOException {
        return countryService.getCountriesRepository();
    }

    @GetMapping("country")
    @ResponseBody
    public List<Country> getCountryData(@RequestParam(name = "code")String iso,
                                        @RequestParam(name = "name")String countryName){
        return countryService.getCountryByCodeAndName(iso,countryName);
    }
}
