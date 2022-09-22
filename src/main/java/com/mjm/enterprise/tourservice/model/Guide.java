package com.mjm.enterprise.tourservice.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "guide")
@Getter
@Setter
public class Guide {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer guide_id;
    private String first_name;
    private String last_name;
    private String email;
    private String phone;
    private String address;
    private String city;
    @Enumerated
    private State state;
    private String zipcode;

}
