package pers.lionlinzq.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 项目配置
 *
 * @author lin
 * @date 2024/03/18
 */
@Configuration
@PropertySource("classpath:application.yml")
public class ProjectConfig {

	@Value("${server.port}")
	public String port;

	@Value("${author}")
	public String author;
}
