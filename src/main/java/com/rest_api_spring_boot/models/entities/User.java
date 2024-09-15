package com.rest_api_spring_boot.models.entities;

import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;

@Entity
@Table(name = "users")
@Data
public class User implements Serializable {

    private static final long serialVersionID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column( unique = true, nullable = false)
    private String username;
    @Column(length = 20, nullable = false)
    private String password;
    @Column(length = 100, nullable = false)
    private String address;
    @Column(length = 18, unique = true, nullable = false)
    private String no_handphone;
}
