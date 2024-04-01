package pers.lionlinzq.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.lionlinzq.beans.PrototypePerson;
import pers.lionlinzq.beans.RequestPerson;
import pers.lionlinzq.beans.SessionPerson;
import pers.lionlinzq.beans.SingletonPerson;

@RestController
@RequestMapping("/test")
public class TestController {

	private static final Logger log = LoggerFactory.getLogger(TestController.class);

	@Autowired
	SingletonPerson singletonPerson;

	@Autowired
	PrototypePerson prototypePerson;

	@Autowired
	RequestPerson requestPerson;

	@Autowired
	SessionPerson sessionPerson;

	@GetMapping("/getScope")
	public void testScope(){
		log.info("singletonPerson:{}",singletonPerson);

		log.info("prototypePerson:{}",prototypePerson);

		// log.info("requestPerson:{}",requestPerson);

		log.info("sessionPerson:{}",sessionPerson);
	}

}
