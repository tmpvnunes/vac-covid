package com.codegate01.vaccovid;

import com.codegate01.vaccovid.entities.World;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.List;

import org.hamcrest.MatcherAssert;
import static org.hamcrest.Matchers.equalTo;


@SpringBootTest
class VacCovidApplicationTests {

	private static final String BASE_URL = "https://vaccovid-coronavirus-vaccine-and-treatment-tracker.p.rapidapi.com/api/npm-covid-data/" ;
	private static final String API_KEY = "65ea31fa2cmshac32f03100384c0p122be5jsne8156bfebaef";
	private static final String API_HOST = "vaccovid-coronavirus-vaccine-and-treatment-tracker.p.rapidapi.com";


	@Test
	void contextLoads() {
	}
	
	@Test
	public void whenGetRequest_thenCorrect() throws IOException {
		OkHttpClient client = new OkHttpClient();

		Request request = new Request.Builder()
				.url(BASE_URL)
				.addHeader("X-RapidAPI-Key", API_KEY)
				.addHeader("X-RapidAPI-Host", API_HOST)
				.build();
		Response response = client.newCall(request).execute();
		String ret = response.body().string();
		//System.out.println(ret);
		Assertions.assertEquals(200, response.code());
	}
	@Test
	void whenGetRequest_thenConvertToObject() throws IOException {
		World worldResponse = new World();
		OkHttpClient client = new OkHttpClient();
		String urlWorld = "https://vaccovid-coronavirus-vaccine-and-treatment-tracker.p.rapidapi.com/api/npm-covid-data/world";
		System.out.println(urlWorld);
		Request request = new Request.Builder()
				.url(urlWorld)
				.addHeader("X-RapidAPI-Key", API_KEY)
				.addHeader("X-RapidAPI-Host", API_HOST)
				.build();

		ResponseBody responseBody = client.newCall(request).execute().body();
		String responseString = responseBody.string();
		System.out.println(responseString);
		ObjectMapper objectMapper = new ObjectMapper();
		List<World> worldList = objectMapper.readValue(responseString, new TypeReference<List<World>>() {});
		Assertions.assertNotNull(worldList);
	}
}
