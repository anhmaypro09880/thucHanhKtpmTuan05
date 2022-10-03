package com.example.springdatajpa2.entity;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import java.io.Serializable;
public class ChungNhanID {
    @Column(name = "MaNV")
    private String MaNV;

    @Column(name = "MaMB")
    private Integer MaMB;
}
