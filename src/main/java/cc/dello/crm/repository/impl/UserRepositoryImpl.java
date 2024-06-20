package cc.dello.crm.repository.impl;

import cc.dello.crm.entity.User;
import cc.dello.crm.repository.custom.UserRepositoryCustom;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepositoryCustom {

  private final JPAQueryFactory queryFactory;

}
