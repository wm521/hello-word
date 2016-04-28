package com.jd.weather.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jd.weather.dao.WeatherDao;
import com.jd.weather.dao.impl.WeatherDaoImpl;
import com.jd.weather.model.Weather;
import com.jd.weather.service.WeatherService;

@RestController
@RequestMapping(value="/weather")
public class WeatherController {
	@Autowired
	private WeatherService weatherService;
	@RequestMapping(value="/today")
	public Weather getWeather(){
		Weather weather = weatherService.findById(1);
		return weather;
	}
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public Weather updateWeather(Weather weather){
		//1.更新
		weatherService.update(weather);
		//2.查询返回
		return weatherService.findById(weather.getId());
	}
	@RequestMapping(value="/own/today")
	public ModelAndView getOwnWeather(){
		Weather weather = weatherService.findById(1);
		ModelAndView result = new ModelAndView("weather", "model", weather);
		return result;
	}
	
	
	
}
