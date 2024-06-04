package id.my.hendisantika.opentelemetrydemo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-opentelemetry-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/4/24
 * Time: 08:35
 * To change this template use File | Settings | File Templates.
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Promotion {
    private Long id;
    private Long productId;
    private BigDecimal discount;
}
