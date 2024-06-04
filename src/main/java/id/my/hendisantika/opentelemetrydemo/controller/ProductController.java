package id.my.hendisantika.opentelemetrydemo.controller;

import id.my.hendisantika.opentelemetrydemo.repository.ProductRepository;
import id.my.hendisantika.opentelemetrydemo.service.PromotionServiceClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-opentelemetry-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/4/24
 * Time: 08:39
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequiredArgsConstructor
public class ProductController {
    private final ProductRepository productRepository;
    private final PromotionServiceClient promotionServiceClient;
}
