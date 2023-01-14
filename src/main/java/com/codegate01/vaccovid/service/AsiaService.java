package com.codegate01.vaccovid.service;

import com.codegate01.vaccovid.entities.Asia;
import com.codegate01.vaccovid.rapidapi.CovidCasesPayload;
import com.codegate01.vaccovid.repository.AsiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class AsiaService {

    @Autowired
    private Environment environment;
    @Autowired
    private AsiaRepository asiaRepository;

    public List<Asia> getAsiaData() throws IOException {
        String apiKey = environment.getProperty("X-RapidAPI-Key");
        String apiHost = environment.getProperty("X-RapidAPI-Host");
        String asiaEndPoint = environment.getProperty("asia-data-endpoint");

        CovidCasesPayload covidCasesPayload = new CovidCasesPayload();
        List<Asia> asiaData = covidCasesPayload.getAsiaData(asiaEndPoint,apiKey, apiHost);
        asiaRepository.saveAll(asiaData);
        return asiaData;
    }
}
