package pers.lionlinzq.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import pers.lionlinzq.service.IPersonService;

@Service
@Primary
public class ChinesePerson implements IPersonService {
	@Override
	public void speak() {
		System.out.println("我会说中文！");
	}
}
