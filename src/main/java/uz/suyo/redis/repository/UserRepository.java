package uz.suyo.redis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.suyo.redis.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
