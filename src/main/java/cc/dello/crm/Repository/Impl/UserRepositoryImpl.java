package cc.dello.crm.Repository.Impl;

import cc.dello.crm.Repository.Custom.UserRepositoryCustom;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepositoryCustom {

  private final JPAQueryFactory queryFactory;

//  public User findOneUser(Long userId) {
//  }

}
