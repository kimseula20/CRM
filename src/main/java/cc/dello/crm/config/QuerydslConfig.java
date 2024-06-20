package cc.dello.crm.config;

import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * JPA의 환경설정 구성
 *
 * @author : kimseula
 * @fileName : JpaConfig
 * @since : 2024/06/20
 */
@Configuration
@EnableJpaAuditing
public class QuerydslConfig {

  // 데이터베이스를 사용하기 위한 주요 인터페이스를 주입받습니다.
  @PersistenceContext
  private EntityManager em;

  @Bean
  public JPAQueryFactory jpaQueryFactory() {
    return new JPAQueryFactory(em);
  }

}
