package com.uptc.tallersergio.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "phone")
@Entity
@Getter
@Setter
@NoArgsConstructor
public class PhoneEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_phone", nullable = false)
    private Integer idPhone;

    @Column(nullable = false, length = 50, unique = true)
    private String name;

    @Column(nullable = false, length = 300)
    private String description;

    @Column(nullable = false, columnDefinition = "Decimal(8,2)")
    private Double price;

    @Column(columnDefinition = "TINYINT default 0")
    private Boolean ios;

    @Column(columnDefinition = "TINYINT default 0 ")
    private Boolean fiveg;

    @Column(columnDefinition = "TINYINT default 0")
    private Boolean available;

}
