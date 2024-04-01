package pers.lionlinzq;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.lionlinzq.config.ProjectConfig;
import pers.lionlinzq.service.IPersonService;

/**
 * 分析应用
 *
 * @author lin
 * @date 2024/03/15
 */
@ComponentScan("pers.lionlinzq.*")
public class AnalysisApplication {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		IPersonService bean = applicationContext.getBean("chinesePerson", IPersonService.class);
		bean.speak();
	}
}
