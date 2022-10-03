package com.example.springdatajpa2.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Time;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "chuyenbay")
public class ChuyenBay {
    @Id

    private String maCB;
    @Column(name = "Gadi")
    private String gaDi;
    @Column(name = "Gaden")
    private String gaDen;
    @Column(name = "Dodai")
    private int doDai;
    @Column(name = "Giodi")
    private Time gioDi;
    @Column(name = "Gioden")
    private Time gioDen;
    @Column(name = "Chiphi")
    private int chiPhi;

}
