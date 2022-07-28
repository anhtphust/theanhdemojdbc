package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.Userdemoimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {
    @Autowired
    Userdemoimpl userdemoimpl;
    @GetMapping("/getall")
    ResponseEntity<List<User>> getallUser () throws SQLException, ClassNotFoundException {
        return ResponseEntity.ok().body(userdemoimpl.getAllUser());
    }

}
