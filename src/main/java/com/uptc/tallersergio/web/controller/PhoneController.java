package com.uptc.tallersergio.web.controller;

import com.uptc.tallersergio.persistence.entity.PhoneEntity;
import com.uptc.tallersergio.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping("/api/phones")
public class PhoneController {
    private final PhoneService phoneService;

    @Autowired
    public PhoneController(PhoneService phoneService){
        this.phoneService = phoneService;
    }

    @GetMapping
    public ResponseEntity<List<PhoneEntity>> getAll(){
        return ResponseEntity.ok((this.phoneService.getAll()));
    }


    @GetMapping("/{idPhone}")
    public ResponseEntity<PhoneEntity> get(@PathVariable int idPhone){
        return ResponseEntity.ok(this.phoneService.get(idPhone));
    }

    @PostMapping
    public ResponseEntity<PhoneEntity> add(@RequestBody PhoneEntity phone){
        if (phone.getIdPhone() == null || !this.phoneService.exists(phone.getIdPhone())){
            return ResponseEntity.ok(this.phoneService.save(phone));
        }
        return ResponseEntity.badRequest().build();

    }

    @PutMapping
    public ResponseEntity<PhoneEntity> update(@RequestBody PhoneEntity phone){
        if (phone.getIdPhone() != null && this.phoneService.exists(phone.getIdPhone())){
            return ResponseEntity.ok(this.phoneService.save(phone));
        }
        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping
    public ResponseEntity<Void> delete(int idPhone){
        if (this.phoneService.exists(idPhone)){
            this.phoneService.delete(idPhone);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.badRequest().build();
    }

}
