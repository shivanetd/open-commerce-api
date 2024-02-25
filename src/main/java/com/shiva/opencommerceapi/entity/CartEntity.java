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
@Table(name = "cart", schema = "ecommerce")
@Getter
@Setter
public class CartEntity {
    
    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "user_id")
    private UUID userId;
    
    @Column(name = "total")
    private long total;
    
    @Column(name = "active")
    private boolean active;
    
    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "modified_date")
    private Date modifiedDate;
    
}
