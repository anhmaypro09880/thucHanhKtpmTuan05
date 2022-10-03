package com.example.springdatajpa2.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "nhanvien")
public class NhanVien {
    @Id
    @Column(name = "MaNV")
    private String maNV;
    @Column(name = "Ten")
    private String tenNV;
    @Column(name = "Luong")
    private double luong;
}
