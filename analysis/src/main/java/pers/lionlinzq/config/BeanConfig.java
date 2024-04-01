package pers.lionlinzq.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import pers.lionlinzq.beans.PrototypePerson;
import pers.lionlinzq.beans.RequestPerson;
import pers.lionlinzq.beans.SessionPerson;
import pers.lionlinzq.beans.SingletonPerson;

/**
 * Bean配置
 *
 * @author lin
 * @date 2024/03/18
 */
@Configuration
public class BeanConfig {

	@Bean
	@Scope("prototype")
	public SingletonPerson singletonPerson(){
		return new SingletonPerson();
	}


	@Bean
	@Scope("prototype")
	public PrototypePerson prototypePerson(){
		return new PrototypePerson();
	}


	@Bean
	// @Scope("request")
	public RequestPerson requestPerson(){
		return new RequestPerson();
	}


	@Bean
	// @Scope("session")
	public SessionPerson sessionPerson(){
		return new SessionPerson();
	}

}
