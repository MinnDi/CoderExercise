package ru.croc.coder.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import ru.croc.coder.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

	Optional<User> findByEmailIgnoreCase(String email);
	//Optional<User> findById(Long id);
}
