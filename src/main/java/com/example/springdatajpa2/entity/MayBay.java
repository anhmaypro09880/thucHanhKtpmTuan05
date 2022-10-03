package com.example.springdatajpa2.entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "maybay")
public class MayBay implements Serializable {
    @Id
    @Column(name = "MaMB")
    private int maMB;
    @Column(name = "Loai")
    private String loai;
    @Column(name = "Tambay")
    private int tamBay;
}
