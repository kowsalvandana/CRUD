package com.sree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sree.model.UserDtls;
import com.sree.repo.UserDtlsRepository;

@SpringBootApplication
public class JpaExpApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(JpaExpApplication.class, args);

		UserDtlsRepository dtlsRepository = context.getBean(UserDtlsRepository.class);

		// System.out.println(dtlsRepoistory.getClass().getName());

		UserDtls user = new UserDtls();
		user.setUserId(103);
		user.setUsername("Swamy");
		user.setUserAge(28);
		user.setUserEmail("swamy@gmail.com");
		user.setUserCountry("INDIA");
		
		dtlsRepository.save(user);
		
		System.out.println("Record Saved.............");

	}

}


