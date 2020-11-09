package src.main.java.com.lijiaying.keshe.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication(scanBasePackages = "com.lijiaying.keshe")
public class KesheAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(KesheAdminApplication.class, args);
    }
}
