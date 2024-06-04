package id.my.hendisantika.opentelemetrydemo.service;

import id.my.hendisantika.opentelemetrydemo.config.ApplicationProperties;
import id.my.hendisantika.opentelemetrydemo.domain.Promotion;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

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
@Service
@RequiredArgsConstructor
@Slf4j
public class PromotionServiceClient {

    private final RestTemplate restTemplate;
    private final ApplicationProperties properties;

    public List<Promotion> getProductPromotions() {
        try {
            log.info("Fetching promotions from {}", properties.getPromotionServiceUrl() + "/api/promotions");
            HttpHeaders headers = new HttpHeaders();
            HttpEntity<?> httpEntity = new HttpEntity<>(headers);
            ResponseEntity<List<Promotion>> response = restTemplate.exchange(
                    properties.getPromotionServiceUrl() + "/api/promotions", HttpMethod.GET, httpEntity,
                    new ParameterizedTypeReference<>() {
                    });
            return response.getBody();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
