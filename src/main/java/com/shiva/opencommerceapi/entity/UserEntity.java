package com.shiva.opencommerceapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "USER", schema = "ecommerce")
@Getter
@Setter
public class UserEntity {
    
    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "email")
    private String email;
    
    @Column(name = "username")
    private String username;
    
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;
    
    @Column(name = "password")
    private String password;
    
    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "modified_date")
    private Date modifiedDate;
    
}
