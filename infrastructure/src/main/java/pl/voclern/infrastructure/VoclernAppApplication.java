package pl.voclern.infrastructure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"pl.voclern"})
@EnableJpaRepositories("pl.voclern")
@EntityScan("pl.voclern")
public class VoclernAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(VoclernAppApplication.class, args);
	}
}
