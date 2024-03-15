package pers.lionlinzq.service.impl;

import org.springframework.stereotype.Service;
import pers.lionlinzq.service.IPersonService;

@Service
public class AmericanPerson implements IPersonService {
	@Override
	public void speak() {
		System.out.println("I can speak english!");
	}
}
