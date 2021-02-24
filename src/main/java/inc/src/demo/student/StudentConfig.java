package inc.src.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student srchang = new Student(
                    "srchang",
                    "dev-srchang@gmail.com",
                    LocalDate.of(1975, Month.MAY, 22),
                    45
            );
            Student ejpark = new Student(
                    "ejpark",
                    "dev-ejpark@gmail.com",
                    LocalDate.of(1978, Month.JULY, 30),
                    42
            );

            studentRepository.saveAll(List.of(srchang, ejpark));
        };
    }
}
