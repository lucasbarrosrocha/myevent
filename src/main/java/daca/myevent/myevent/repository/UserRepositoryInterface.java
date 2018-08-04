package daca.myevent.myevent.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import daca.myevent.myevent.models.user.User;


@Repository
public interface UserRepositoryInterface extends JpaRepository<User, Long>{
	
	Optional<User> findByEmail(String email);
	Boolean existsByEmail(String email);
}