package com.thanga.newsapp.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.thanga.newsapp.model.ResultObj;

@Service
public class NewsHeadlineService {

	public static final String TOP_HEADLINES_URL = "https://newsapi.org/v2/top-headlines?apiKey=dbb90c83e2734e9f92b130daf3d37c1d";
	public static final String EVERYTHING_URL = "https://newsapi.org/v2/everything?apiKey=dbb90c83e2734e9f92b130daf3d37c1d";

	public ResultObj getHeadlineByCountry(String country) {
		String resourceUrl = TOP_HEADLINES_URL + "&country=" + country;
		return getResponseBody(resourceUrl);
	}

	public ResultObj getHeadlineBySource(String sources) {
		String resourceUrl = TOP_HEADLINES_URL + "&sources=" + sources;
		return getResponseBody(resourceUrl);
	}

	private ResultObj getResponseBody(String resourceUrl) {
		RestTemplate restTemplate = new RestTemplate();
		ResultObj resultObj = restTemplate.getForObject(resourceUrl, ResultObj.class);
		return resultObj;
	}

}
