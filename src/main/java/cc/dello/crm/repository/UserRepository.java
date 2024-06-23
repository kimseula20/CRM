package cc.dello.crm.repository;

import cc.dello.crm.entity.User;
import cc.dello.crm.repository.custom.UserRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface UserRepository extends JpaRepository<User, Long>, UserRepositoryCustom {



}
