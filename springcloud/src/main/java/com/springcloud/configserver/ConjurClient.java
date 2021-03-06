package com.springcloud.configserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import com.cyberark.conjur.springboot.annotations.ConjurPropertySource;
import com.cyberark.conjur.springboot.annotations.Registrar;

@SpringBootApplication

public class ConjurClient {

//	private static Logger logger = LoggerFactory.getLogger(ConjurClient.class);
//
//	@Autowired
//	private Environment env;
//
//	@Value("${dbuserName}")
//	private byte[] pass1;
//
//	public static void main(String[] args) {
//
//		SpringApplication.run(ConjurClient.class, args);
//
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//		System.out.println("Inside Run");
//		System.setProperty("CONJUR_ACCOUNT", env.getProperty("CONJUR_ACCOUNT"));
//		System.setProperty("CONJUR_APPLIANCE_URL", env.getProperty("CONJUR_APPLIANCE_URL"));
//		System.setProperty("CONJUR_AUTHN_LOGIN", env.getProperty("CONJUR_AUTHN_LOGIN"));
//		System.setProperty("CONJUR_AUTHN_API_KEY", env.getProperty("CONJUR_AUTHN_API_KEY"));
//		System.setProperty("CONJUR_CERT_FILE", env.getProperty("CONJUR_CERT_FILE"));
//		System.setProperty("CONJUR_SSL_CERTIFICATE", env.getProperty("CONJUR_SSL_CERTIFICATE"));
//		Registrar register =new Registrar();
//		register.setEnvironment(env);
//		logger.info("Environment variable set");
//		logger.info(">>>>>" + env.getProperty("msg"));
//		logger.info(">>>>>" + env.getProperty("CONJUR_ACCOUNT"));
//		logger.info(">>>>>" + env.getProperty("CONJUR_APPLIANCE_URL"));
//		logger.info(">>>>>" + env.getProperty("CONJUR_AUTHN_LOGIN"));
//		logger.info(">>>>>" + env.getProperty("CONJUR_AUTHN_API_KEY"));
//		logger.info(">>>>>" + env.getProperty("CONJUR_CERT_FILE"));
//		logger.info(">>>>>" + env.getProperty("CONJUR_SSL_CERTIFICATE"));
//		logger.info("By Using Standard Spring annotation -->  " + new String(pass1) + "  ");
//
//	}

}
