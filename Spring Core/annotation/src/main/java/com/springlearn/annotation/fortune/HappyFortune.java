package com.springlearn.annotation.fortune;

import org.springframework.stereotype.Component;


//Implementing default component names
@Component
public class HappyFortune implements FortuneServices {

	public String getFortune() {
		// TODO Auto-generated method stub
		return "Aaj ka din changa";
	}

}
