package id.my.hendisantika.promotionservice.config;

import io.opentelemetry.exporter.jaeger.JaegerGrpcSpanExporter;
import io.opentelemetry.exporter.jaeger.JaegerGrpcSpanExporterBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

import java.util.concurrent.TimeUnit;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-opentelemetry-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/4/24
 * Time: 08:58
 * To change this template use File | Settings | File Templates.
 */
@Configuration
public class AppConfig {

    @Bean
    JaegerGrpcSpanExporter otelJaegerGrpcSpanExporter(ApplicationProperties properties) {
        JaegerGrpcSpanExporterBuilder builder = JaegerGrpcSpanExporter.builder();
        String endpoint = properties.getJaeger().getEndpoint();
        if (StringUtils.hasText(endpoint)) {
            builder.setEndpoint(endpoint);
        }
        Long timeout = properties.getJaeger().getTimeout();
        if (timeout != null) {
            builder.setTimeout(timeout, TimeUnit.MILLISECONDS);
        }
        return builder.build();
    }
}
