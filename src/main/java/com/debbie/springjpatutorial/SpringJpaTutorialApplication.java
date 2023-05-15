package com.debbie.springjpatutorial;

import com.debbie.springjpatutorial.student.model.Student;
import com.debbie.springjpatutorial.student.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringJpaTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaTutorialApplication.class, args);
	}


	@Bean
	CommandLineRunner commandLineRunner(StudentRepository studentRepository){
		return args -> {
			Student debbie = new Student(
					"Debbie",
					"Asamoah",
					"d.a@gmail.com",
					23
			);
			studentRepository.save(debbie);
		};
	}

}
