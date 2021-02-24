package com.revature.joseph.logsample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogSimulator {
	private static Logger log = LogManager.getLogger(LogSimulator.class);
	
	public static void main(String[] args) {
		loggingMethod();
	}
	
	public static void loggingMethod() {
		log.trace("TRACE MESSAGE");
		log.debug("DEBUG MESSAGE");
		log.info("INFO MESSAGE");
		log.warn("WARN MESSAGE");
		log.error("ERROR MESSAGE");
		log.fatal("FATAL MESSAGE");
	}

}
