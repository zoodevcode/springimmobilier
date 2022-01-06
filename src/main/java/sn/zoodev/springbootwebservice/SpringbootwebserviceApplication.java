package sn.zoodev.springbootwebservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootwebserviceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootwebserviceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("l'enregistrement est reussi avec succes");
	}
}
