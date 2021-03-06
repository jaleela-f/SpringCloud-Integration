package com.springcloud.configserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cyberark.conjur.springboot.annotations.ConjurPropertySource;

@RestController
@ConjurPropertySource(value = {"jenkins-app/" })
public class ConfigProperty {

	@Value("${msg:Config Server is not working. Please check...}")
	private String msg;

	@GetMapping("/msg")
	public String getMsg() {
		return this.msg;
	}
	@Value("${key}")
	private String authKey;

	@Value("${CONJUR_ACCOUNT}")
	private String conjurAccount;

	@Value("${CONJUR_APPLIANCE_URL}")
	private String conjurApplianceUrl;

	@Value("${CONJUR_AUTHN_LOGIN:}")
	private String conjurAuthLogin;

	@Value("${CONJUR_AUTHN_API_KEY}")
	private String conjurAuthAPIKey;

	@Value("${CONJUR_CERT_FILE}")
	private String conjurAuthSSLCert;

	@Value("${CONJUR_SSL_CERTIFICATE}")
	private String conjurAuthCert;

	@GetMapping("/conjurAccount")
	public String getConjurAccount() {
		System.out.println(">>>conjurAccount");
		return conjurAccount;
	}

	public String getConjurApplianceUrl() {
		return conjurApplianceUrl;
	}

	public String getConjurAuthLogin() {
		return conjurAuthLogin;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
