package sample.mine.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * 配置类
 *
 * @author yuanll
 */
@Configuration
@ConditionalOnProperty(prefix = "spring.sample.mine.config", value = "enabled", havingValue = "true")
public class AutoConfig {

	@PostConstruct
	public void init() {
		System.out.println("config initialized");
	}

}
