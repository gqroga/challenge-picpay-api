package com.challenge_picpay_api.repositories;

import com.challenge_picpay_api.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserModel, Long> {

    Optional<UserModel> findUserByDocument(String document);

    Optional<UserModel> findUserById(Long id);

}
