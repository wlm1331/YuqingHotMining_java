package cn.tledu.job004;

import org.apache.log4j.Logger;

public class Log4jTest {
	public static Logger logger = Logger.getLogger(Log4jTest.class);

	public static void main(String[] args) {
		logger.error("debug轻松一下!");
	}

}
