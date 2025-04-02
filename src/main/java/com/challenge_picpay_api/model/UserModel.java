package com.challenge_picpay_api.model;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import com.challenge_picpay_api.enums.UserType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import jakarta.persistence.GenerationType;
import java.math.BigDecimal;
import jakarta.persistence.GeneratedValue;

@Entity
@Data
@AllArgsConstructor
@Table(name = "users")
@EqualsAndHashCode(of = "id")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fistName;
    private String lastName;

    @Column(unique = true)
    private String document;

    @Column(unique = true)
    private String email;
    private String password;
    private BigDecimal balance;

    @Enumerated(EnumType.STRING)
    private UserType userType;
}
