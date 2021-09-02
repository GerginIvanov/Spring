package net.api.exercise;

import net.api.exercise.Model.Student;
import net.api.exercise.Repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student Maria = new Student(
                    "Maria",
                    "Jones",
                    "Maria.Jones@gmail.com",
                    24
            );
            studentRepository.save(Maria);
        };
    }
}
