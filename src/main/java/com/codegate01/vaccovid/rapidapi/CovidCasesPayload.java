package com.codegate01.vaccovid.rapidapi;


import com.codegate01.vaccovid.entities.Africa;
import com.codegate01.vaccovid.entities.Asia;
import com.codegate01.vaccovid.entities.Country;
import com.codegate01.vaccovid.entities.World;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

import java.io.IOException;
import java.util.List;

/*
VACCOVID - coronavirus, vaccine and treatment tracker API Documentation VACCOVID.
LIVE is a comprehensive up-to-date Vaccine tracker, COVID-19 tracker and Treatment tracker website
which has been landed to inform people throughout the planet about the present novel coronavirus (COVID-19) pandemic.
In VACCOVID you can also find the most relevant and up-to-date news about covid-19. https://vaccovid.live/
 */
public class CovidCasesPayload {

    /*
    call this API to get all information for coviid-19 World data, such as Total cases, New cases, Total deaths,
    New deaths, Total Recovered, New recovered, Total Tests, New Tests, Active Cases, SeriousCritical, InfectionRisk, CaseFatalityRate,
     */
    public List<World> getWorldData(String endPointUrl, String key, String host) throws IOException {

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(endPointUrl)
                .addHeader("X-RapidAPI-Key", key)
                .addHeader("X-RapidAPI-Host", host)
                .build();

        System.out.println(request.toString());

        Response call = client.newCall(request).execute();
        ResponseBody responseBody = call.body();

        if (call.code() != 200) {
            return null;
        } else {
            String responseString = responseBody.string();
            System.out.println(responseString);

            ObjectMapper objectMapper = new ObjectMapper();
            List<World> worldList = objectMapper.readValue(responseString, new TypeReference<List<World>>() {
            });

            return worldList;
        }
    }

    public List<Country> getCountriesData(String endPointUrl, String key, String host) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(endPointUrl)
                .addHeader("X-RapidAPI-Key", key)
                .addHeader("X-RapidAPI-Host", host)
                .build();

        System.out.println(request.toString());

        Response call = client.newCall(request).execute();
        ResponseBody responseBody = call.body();

        if (call.code() != 200) {
            return null;
        } else {
            String responseString = responseBody.string();
            System.out.println(responseString);
            ObjectMapper objectMapper = new ObjectMapper();
            List<Country> countryList = objectMapper.readValue(responseString, new TypeReference<List<Country>>() {
            });
            return countryList;
        }
    }

    public List<Asia> getAsiaData(String endPointUrl, String apiKey, String apiHost) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(endPointUrl)
                .addHeader("X-RapidAPI-Key", apiKey)
                .addHeader("X-RapidAPI-Host", apiHost)
                .build();

        System.out.println(request.toString());

        Response call = client.newCall(request).execute();
        ResponseBody responseBody = call.body();

        if (call.code() != 200) {
            return null;
        } else {
            String responseString = responseBody.string();
            System.out.println(responseString);
            ObjectMapper objectMapper = new ObjectMapper();
            List<Asia> asiaList = objectMapper.readValue(responseString, new TypeReference<List<Asia>>() {
            });
            return asiaList;
        }
    }

    public List<Africa> getAfricaData(String africaEndPoint, String apiKey, String apiHost) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(africaEndPoint)
                .addHeader("X-RapidAPI-Key", apiKey)
                .addHeader("X-RapidAPI-Host", apiHost)
                .build();

        System.out.println(request.toString());

        Response call = client.newCall(request).execute();
        ResponseBody responseBody = call.body();

        if (call.code() != 200) {
            return null;
        } else {
            String responseString = responseBody.string();
            System.out.println(responseString);
            ObjectMapper objectMapper = new ObjectMapper();
            List<Africa> africaList = objectMapper.readValue(responseString, new TypeReference<List<Africa>>() {
            });
            return africaList;
        }
    }
}
