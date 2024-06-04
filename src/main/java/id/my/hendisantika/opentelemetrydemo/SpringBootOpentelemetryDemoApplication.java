package id.my.hendisantika.opentelemetrydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class SpringBootOpentelemetryDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootOpentelemetryDemoApplication.class, args);
    }

}
