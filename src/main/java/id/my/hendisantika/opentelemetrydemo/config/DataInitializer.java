package id.my.hendisantika.opentelemetrydemo.config;

import id.my.hendisantika.opentelemetrydemo.domain.Product;
import id.my.hendisantika.opentelemetrydemo.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-opentelemetry-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/4/24
 * Time: 08:37
 * To change this template use File | Settings | File Templates.
 */
@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {
    private final ProductRepository repository;

    @Override
    public void run(String... args) throws Exception {
        Product p1 = new Product(1L, "Samsung TV", new BigDecimal(45000));
        Product p2 = new Product(2L, "LG Fritz", new BigDecimal(25000));
        Product p3 = new Product(3L, "Lenovo Laptop", new BigDecimal(65000));
        Product p4 = new Product(4L, "Xiaomi Mi TV", new BigDecimal(60000));
        Product p5 = new Product(5L, "Cooca TV", new BigDecimal(50000));
        repository.saveAll(List.of(p1, p2, p3, p4, p5));
    }
}
