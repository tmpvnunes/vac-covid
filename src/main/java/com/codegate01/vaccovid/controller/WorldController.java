package com.codegate01.vaccovid.controller;

import com.codegate01.vaccovid.entities.World;
import com.codegate01.vaccovid.service.WorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;
/*
call this API to get all information for coviid-19 World data, such as Total cases, New cases, Total deaths,
New deaths, Total Recovered, New recovered, Total Tests, New Tests, Active Cases, SeriousCritical, InfectionRisk, CaseFatalityRate,
 */
@RestController
@RequestMapping("api/v1/")
public class WorldController {

    @Autowired
    WorldService worldService;

    @GetMapping("world")
    public List <World> getWorldData() throws IOException {

        return worldService.getWorldRepository();
    }

}
