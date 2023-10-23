package com.dalvarez.soap.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.dalvarez.soap.services.VehiculoServices;

import jakarta.xml.ws.Endpoint;

@Configuration
@EnableJpaRepositories(basePackages = "com.dalvarez.soap.repository")
public class ConfigWebService {

	@Autowired
	private VehiculoServices vehiculoServices;

	@Bean
	public Endpoint vehiculosEndpoints() {
		Endpoint endpoints = Endpoint.publish("http://0.0.0.0:8081/", vehiculoServices);
		return endpoints;
	}

}