package com.example.springdatajpa2.controller;
import com.example.springdatajpa2.dao.ChuyenBayRepository;
import com.example.springdatajpa2.dao.MayBayRepository;
import com.example.springdatajpa2.entity.ChuyenBay;
import com.example.springdatajpa2.entity.MayBay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ChuyenBayController {
    @Autowired
    private ChuyenBayRepository cbRepository;
    @Autowired
    private MayBayRepository mayBayRepository;
    @GetMapping("/chuyenbay")
    public List<ChuyenBay> getAllChuyenBay(){
        return cbRepository.findAll();
    }
    @GetMapping("/maybay")
    public List<MayBay> getAllMayBay(){
        return mayBayRepository.findAll();
    }
}
