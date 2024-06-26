package id.my.hendisantika.opentelemetrydemo.controller;

import id.my.hendisantika.opentelemetrydemo.domain.Product;
import id.my.hendisantika.opentelemetrydemo.domain.ProductResult;
import id.my.hendisantika.opentelemetrydemo.domain.Promotion;
import id.my.hendisantika.opentelemetrydemo.repository.ProductRepository;
import id.my.hendisantika.opentelemetrydemo.service.PromotionServiceClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

    @GetMapping("/api/products")
    public List<ProductResult> getProducts() {
        List<Product> products = productRepository.findAll();

        List<Promotion> promotions = promotionServiceClient.getProductPromotions();
        Map<Long, Promotion> promotionsMap = promotions
                .stream().collect(Collectors.toMap(Promotion::getProductId, promotion -> promotion));

        List<ProductResult> productResults = new ArrayList<>(products.size());
        for (Product product : products) {
            ProductResult productResult = new ProductResult();
            productResult.setId(product.getId());
            productResult.setName(product.getName());
            productResult.setOriginalPrice(product.getPrice());
            if (promotionsMap.containsKey(product.getId())) {
                Promotion promotion = promotionsMap.get(product.getId());
                productResult.setDiscount(promotion.getDiscount());
                productResult.setPrice(product.getPrice().subtract(promotion.getDiscount()));
            } else {
                productResult.setDiscount(BigDecimal.ZERO);
                productResult.setPrice(product.getPrice());
            }
            productResults.add(productResult);
        }
        return productResults;
    }
}
