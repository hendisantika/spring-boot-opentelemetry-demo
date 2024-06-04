package id.my.hendisantika.opentelemetrydemo.controller;

import id.my.hendisantika.opentelemetrydemo.service.PromotionServiceClient;
import org.junit.jupiter.api.BeforeAll;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.testcontainers.containers.PostgreSQLContainer;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-opentelemetry-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/4/24
 * Time: 08:42
 * To change this template use File | Settings | File Templates.
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class ProductControllerTest {
    static PostgreSQLContainer<?> postgres =
            new PostgreSQLContainer<>("postgres:17beta1-alpine3.20");
    @MockBean
    private PromotionServiceClient promotionServiceClient;

    @BeforeAll
    static void beforeAll() {
        postgres.start();
    }
}
