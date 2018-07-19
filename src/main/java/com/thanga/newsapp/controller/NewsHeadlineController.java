package com.thanga.newsapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thanga.newsapp.model.ResultObj;
import com.thanga.newsapp.service.NewsHeadlineService;

@RestController
@RequestMapping("/headline")
public class NewsHeadlineController {

	@Autowired
	private NewsHeadlineService newsHeadlineService;

	@RequestMapping(value = "/country/{country}", method = RequestMethod.GET)
	public ResultObj getHeadlineByCountry(@PathVariable(value = "country") String country) {
		return newsHeadlineService.getHeadlineByCountry(country);
	}

	@RequestMapping(value = "/sources/{sources}", method = RequestMethod.GET)
	public ResultObj getHeadlineBySource(@PathVariable(value = "sources") String sources) {
		return newsHeadlineService.getHeadlineBySource(sources);
	}

}
