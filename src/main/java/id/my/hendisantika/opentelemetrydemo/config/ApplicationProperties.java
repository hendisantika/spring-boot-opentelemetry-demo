package id.my.hendisantika.opentelemetrydemo.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-opentelemetry-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/4/24
 * Time: 08:33
 * To change this template use File | Settings | File Templates.
 */
@ConfigurationProperties(prefix = "app")
@Setter
@Getter
public class ApplicationProperties {
    private String promotionServiceUrl;
    private Jaeger jaeger = new Jaeger();

    @Setter
    @Getter
    public static class Jaeger {
        private boolean enabled = true;
        private Long timeout;
        private String endpoint;
    }
}
