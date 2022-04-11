package com.springcloud.configserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RefreshScope
@RestController
public class ConjurServerClient {

	@Value("${CONJUR_ACCOUNT}")
	private String conjurAccount;

	@Value("${CONJUR_APPLIANCE_URL}")
	private String conjurApplianceUrl;

	@Value("${CONJUR_AUTHN_LOGIN:}")
	private String conjurAuthLogin;

	@Value("${CONJUR_AUTHN_TOKEN_FILE}")
	private String conjurAuthTokenFile;

	public String getConjurAccount() {
		return conjurAccount;
	}

	public void setConjurAccount(String conjurAccount) {
		this.conjurAccount = conjurAccount;
	}

	public String getConjurApplianceUrl() {
		return conjurApplianceUrl;
	}

	public void setConjurApplianceUrl(String conjurApplianceUrl) {
		this.conjurApplianceUrl = conjurApplianceUrl;
	}

	public String getConjurAuthLogin() {
		return conjurAuthLogin;
	}

	public void setConjurAuthLogin(String conjurAuthLogin) {
		this.conjurAuthLogin = conjurAuthLogin;
	}

	public String getConjurAuthTokenFile() {
		return conjurAuthTokenFile;
	}

	public void setConjurAuthTokenFile(String conjurAuthTokenFile) {
		this.conjurAuthTokenFile = conjurAuthTokenFile;
	}

   
	   public static void main(String[] args) {
	      SpringApplication.run(ConjurServerClient.class, args);
	   }
	   @RequestMapping(value = "/")
	   public String conjurAccount() {
		  
	      return conjurAccount;
	   }
	
	
}
