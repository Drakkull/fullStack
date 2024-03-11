package drakkull.fullstackBackend.repository;

import drakkull.fullstackBackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
