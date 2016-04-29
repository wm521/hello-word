package com.jd.weather.controller;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping(value="/weath")
public class RoadController {
	public static Logger logger=LoggerFactory.getLogger(RoadController.class);
	@RequestMapping(value={"/weather2","/weather3"})
	public ModelAndView index(){
		logger.info("访问come首页info");
		logger.debug("访问come首页info");
		logger.warn("访问come首页info");
		logger.error("访问come首页info");
		return new ModelAndView("RoadController");
	}
	public String roadMessage(){
		
		return "大堵车";
	
	}
}

