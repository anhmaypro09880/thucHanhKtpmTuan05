package com.example.springdatajpa2.controller;

import com.example.springdatajpa2.dao.NhanVienRepository;
import com.example.springdatajpa2.entity.NhanVien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class NhanVienController {
    @Autowired
    private NhanVienRepository nvRepository;

    @GetMapping("nhanvien")
    public List<NhanVien> getAllNhanVien(){
        return nvRepository.findAll();
    }

}
