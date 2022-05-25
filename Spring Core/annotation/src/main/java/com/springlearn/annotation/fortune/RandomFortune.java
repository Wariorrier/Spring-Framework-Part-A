package com.springlearn.annotation.fortune;

import org.springframework.stereotype.Component;

@Component
public class RandomFortune implements FortuneServices {

	public String getFortune() {
		// TODO Auto-generated method stub
		return "This is random service";
	}

}
