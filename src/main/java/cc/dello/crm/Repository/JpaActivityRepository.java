package cc.dello.crm.Repository;

import cc.dello.crm.Entity.volvo.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface JpaActivityRepository extends JpaRepository<Activity, Long> {

}
