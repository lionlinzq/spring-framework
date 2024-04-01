package pers.lionlinzq;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
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
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnalysisApplication.class);
		IPersonService bean = context.getBean(IPersonService.class);
		bean.speak();

		ProjectConfig projectConfig = context.getBean(ProjectConfig.class);
		System.out.println(projectConfig.author);

		
	}
}
