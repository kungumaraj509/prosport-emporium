package com.mshop.restapi.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@OpenAPIDefinition(
		info = @Info(
				contact=@Contact(
			name = "Nilesh",
			email="nilesh@gmail.com",
			url="https://onlinemedicalshop-url.com"
				),
		description="This is open api documentation for Online Medical Shop",
		title="OnlineMedicalShop",
		version="1.0",
		license=@License(
				name="MIT",
				url="https://onlinemedicalshop-url.com"
				),
		termsOfService=
		"Terms of service"
				)
		)
public class OpenApiConfig {

}