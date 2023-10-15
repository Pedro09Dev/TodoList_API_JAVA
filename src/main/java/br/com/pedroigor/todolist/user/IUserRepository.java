package br.com.pedroigor.todolist.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IUserRepository extends JpaRepository<userModel, UUID> {
    userModel findByUsername(String username);
}
