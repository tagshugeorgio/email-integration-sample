package tech.uwaas.email.emailsample;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tech.uwaas.email.emailsample.email.EmailService;

@SpringBootApplication
public class EmailSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailSampleApplication.class, args);
	}

}
