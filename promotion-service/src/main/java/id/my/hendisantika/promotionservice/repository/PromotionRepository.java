package id.my.hendisantika.promotionservice.repository;

import id.my.hendisantika.promotionservice.domain.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-opentelemetry-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/4/24
 * Time: 08:57
 * To change this template use File | Settings | File Templates.
 */
@Repository
public interface PromotionRepository extends JpaRepository<Promotion, Long> {
}
