package sample.mine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.support.SpringFactoriesLoader;

import java.util.List;

/**
 * @author yuanll
 */
@SpringBootApplication
public class SampleMineApplication {
	public static void main(String[] args) {
		List<String> list = SpringFactoriesLoader.loadFactoryNames(EnableAutoConfiguration.class, null);
		System.out.println(list);
		SpringApplication.run(SampleMineApplication.class, args);
	}
}
