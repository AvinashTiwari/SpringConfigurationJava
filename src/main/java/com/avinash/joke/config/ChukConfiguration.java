package com.avinash.joke.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Configuration
public class ChukConfiguration {

	@Bean
	public ChuckNorrisQuotes ChuckNorrisQuotes(){
		return new ChuckNorrisQuotes();
	} 
}
