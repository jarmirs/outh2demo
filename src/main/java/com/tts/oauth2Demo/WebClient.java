package com.tts.oauth2Demo;

import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.web.OAuth2AuthorizedClientRepository;
import org.springframework.security.oauth2.client.web.reactive.function.client.ServletOAuth2AuthorizedClientExchangeFilterFunction;
@Bean
public class WebClient{
	Object rest(ClientRegistrationRepository clients, OAuth2AuthorizedClientRepository authz) {
	    ServletOAuth2AuthorizedClientExchangeFilterFunction oauth2 =
	            new ServletOAuth2AuthorizedClientExchangeFilterFunction(clients, authz);
	    return ((Object) WebClient.builder())
	            .filter(oauth2).build();
}

	private static Object builder() {
		// TODO Auto-generated method stub
		return null;
	}
}
