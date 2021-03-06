package com.springcloud.configserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.core.env.Environment;

/**
 * @author Jaleela.FaizurRahman
 *
 */
@SpringBootApplication

public class ConjurServerClient {

	private static Logger logger = LoggerFactory.getLogger(ConjurServerClient.class);

	public static void main(String[] args) {

		SpringApplication.run(ConjurServerClient.class, args);

	}

	@Autowired
	public void setEnv(Environment e) {

		logger.info("Environment variable set");
		logger.info(">>>>>" + e.getProperty("msg"));
		logger.info(">>>>>" + e.getProperty("CONJUR_ACCOUNT"));
		logger.info(">>>>>" + e.getProperty("CONJUR_APPLIANCE_URL"));
		logger.info(">>>>>" + e.getProperty("CONJUR_AUTHN_LOGIN"));
		logger.info(">>>>>" + e.getProperty("CONJUR_AUTHN_API_KEY"));
		logger.info(">>>>>" + e.getProperty("CONJUR_CERT_FILE"));
		logger.info(">>>>>" + e.getProperty("CONJUR_SSL_CERTIFICATE"));
		logger.info(">>>>>" + e.getProperty("key"));

	}

}
