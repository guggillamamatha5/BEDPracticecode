package com.javain.logger;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class LoggerController {

	
Logger logger = LoggerFactory.getLogger(LoggerController.class);
	
	@RequestMapping("/logs")
	
	public String log() {
		
		logger.trace("Log Level : This is a TRACE Message");
		logger.info("Log Level : This is a Info Message");
		logger.debug("Log Level :This is a Debug Message");
		logger.error("Log Level : This is a Error Message");
		logger.warn("Log Level :This is a Warn Message");
		
		
		return "Hey mamatha You can check the logs Here....!!! ";
	
			
	}

}
