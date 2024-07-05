package cc.dello.crm.Repository.Impl;

import cc.dello.crm.Entity.QActivity;
import cc.dello.crm.Entity.volvo.Activity;
import com.querydsl.jpa.impl.JPAQueryFactory;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ActivityRepository {

  private final JPAQueryFactory queryFactory;

  public List<Activity> findAllActivities(String filters) {
    return queryFactory.select(new QActivity(
        String.valueOf(QActivity.activity.id)
    )).fetch();
  }

}
