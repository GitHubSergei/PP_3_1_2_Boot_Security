package ru.kata.spring.boot_security.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.models.WebUser;

import java.util.Optional;

@Repository
public interface WebUserRepository extends JpaRepository<WebUser, Long> {
    Optional<WebUser> findByUserlogin(String name);
}
