package com.mjm.enterprise.tourservice.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tour")
@Getter
@Setter
public class Tour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tour_id")
    private Integer tourId;
    @Column(name = "tour_name")
    private String tourName;
    @Enumerated
    @Column(name = "tour_type")
    private Tourtype tourType;

}
