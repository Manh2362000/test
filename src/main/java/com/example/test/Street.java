package com.example.test;

import lombok.*;
import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity(name = "streets")
public class Street {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    @Column(name = "districtId")
    private int districtId;
    @ManyToOne
    @JoinColumn(name = "districtId",insertable = false,updatable = false)
    private District district;
    private StreetEnum status;
}