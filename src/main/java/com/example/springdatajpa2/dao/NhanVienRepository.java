package com.example.springdatajpa2.dao;

import com.example.springdatajpa2.entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NhanVienRepository extends JpaRepository<NhanVien,String> {
}
