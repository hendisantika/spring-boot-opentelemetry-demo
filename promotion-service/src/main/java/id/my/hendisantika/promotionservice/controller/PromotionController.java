package id.my.hendisantika.promotionservice.controller;

import id.my.hendisantika.promotionservice.domain.Promotion;
import id.my.hendisantika.promotionservice.repository.PromotionRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
@RestController
@RequiredArgsConstructor
@Slf4j
public class PromotionController {
    private final PromotionRepository promotionRepository;

    @GetMapping("/api/promotions")
    public List<Promotion> getPromotions() {
        //randomWait();
        return promotionRepository.findAll();
    }

    private void randomWait() {
        int waitSeconds = getRandomNumber(0, 3);
        log.info("Sleeping for {} seconds", waitSeconds);
        try {
            Thread.sleep(waitSeconds * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
