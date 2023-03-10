package com.codegate01.vaccovid.service;

import com.codegate01.vaccovid.entities.World;
import com.codegate01.vaccovid.rapidapi.CovidCasesPayload;
import com.codegate01.vaccovid.repository.WorldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class WorldService {

    @Autowired
    private Environment environment;
    @Autowired
    private WorldRepository worldRepository;

    public List<World> getWorldRepository() throws IOException {

        String apiKey = environment.getProperty("X-RapidAPI-Key");
        String apiHost = environment.getProperty("X-RapidAPI-Host");
        String worldEndPoint = environment.getProperty("world-data-endpoint");

        CovidCasesPayload covidCasesPayload = new CovidCasesPayload();
        List<World> worldData = covidCasesPayload.getWorldData(worldEndPoint, apiKey, apiHost);
        worldRepository.saveAll(worldData);
        return worldData;
    }
}
