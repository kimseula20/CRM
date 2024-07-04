package cc.dello.crm.Repository;

import cc.dello.crm.Entity.volvo.User;
import cc.dello.crm.Repository.Custom.UserRepositoryCustom;
import java.awt.print.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface JpaUserRepository extends JpaRepository<User, Long>, Pageable {



}
