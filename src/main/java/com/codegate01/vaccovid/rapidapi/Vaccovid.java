package com.codegate01.vaccovid.rapidapi;


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
public class Vaccovid {

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
            List<Country> countryList = objectMapper.readValue(responseString, new TypeReference<List<Country>>() {});

            return countryList;
        }
    }
}
