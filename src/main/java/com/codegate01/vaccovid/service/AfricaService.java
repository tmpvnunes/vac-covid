package com.codegate01.vaccovid.service;

import com.codegate01.vaccovid.entities.Africa;
import com.codegate01.vaccovid.rapidapi.CovidCasesPayload;
import com.codegate01.vaccovid.repository.AfricaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class AfricaService {

    @Autowired
    private Environment environment;
    @Autowired
    private AfricaRepository africaRepository;

    public List<Africa> getAfricaData() throws IOException {
        String apiKey = environment.getProperty("X-RapidAPI-Key");
        String apiHost = environment.getProperty("X-RapidAPI-Host");
        String africaEndPoint = environment.getProperty("africa-data-endpoint");

        CovidCasesPayload covidCasesPayload = new CovidCasesPayload();
        List<Africa> africaData = covidCasesPayload.getAfricaData(africaEndPoint,apiKey, apiHost);
        africaRepository.saveAll(africaData);
        return africaData;
    }
}
