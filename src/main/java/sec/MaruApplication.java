package sec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableAutoConfiguration()
@ComponentScan(basePackages = {"sec"})
public class MaruApplication {

    public static void main(String[] args) {
        SpringApplication.run(MaruApplication.class, args);
    }

}
