package id.my.hendisantika.promotionservice.config;

import id.my.hendisantika.promotionservice.domain.Promotion;
import id.my.hendisantika.promotionservice.repository.PromotionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-opentelemetry-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/4/24
 * Time: 08:59
 * To change this template use File | Settings | File Templates.
 */
@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {
    private final PromotionRepository repository;

    @Override
    public void run(String... args) throws Exception {
        Promotion p1 = new Promotion(1L, 1L, BigDecimal.TEN);
        Promotion p2 = new Promotion(2L, 2L, BigDecimal.ONE);
        repository.save(p1);
        repository.save(p2);
    }
}
