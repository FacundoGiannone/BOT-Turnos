package com.Bot.GG.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bot.GG.entity.Admin;
import com.Bot.GG.iService.IAdminService;



@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
    private IAdminService aService;

    @GetMapping
    public List<Admin> getAllAdmin() {
        return aService.findAllAdmin();
    }

    @PostMapping
    public Admin createAdmin(@RequestBody Admin admin) {
        return aService.saveAdmin(admin);
    }
    
    @DeleteMapping
    public ResponseEntity<Void> eliminarAdmin(@RequestBody Admin admin) {
        aService.removeAdmin(admin);
        return ResponseEntity.noContent().build(); // 204 No Content
    }

}
