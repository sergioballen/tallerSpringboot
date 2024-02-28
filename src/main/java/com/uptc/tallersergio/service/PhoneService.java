package com.uptc.tallersergio.service;

import com.uptc.tallersergio.persistence.entity.PhoneEntity;
import com.uptc.tallersergio.persistence.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class PhoneService {
    //private final JdbcTemplate jdbcTemplate;
    private final PhoneRepository phoneRepository;

    @Autowired
    public PhoneService(PhoneRepository phoneRepository){
        this.phoneRepository = phoneRepository;
    }

    public List<PhoneEntity> getAll(){
        return this.phoneRepository.findAll();
        //return this.jdbcTemplate.query("SELECT * FROM phone", new BeanPropertyRowMapper<>(PhoneEntity.class));

    }

    public PhoneEntity get(int idPhone){
        return this.phoneRepository.findById(idPhone).orElse(null);
    }

    public PhoneEntity save(PhoneEntity phone){
        return this.phoneRepository.save(phone);
    }

    public void delete(int idPhone){
        this.phoneRepository.deleteById(idPhone);
    }

    public boolean exists(int idPhone){
        return this.phoneRepository.existsById(idPhone);
    }

}
