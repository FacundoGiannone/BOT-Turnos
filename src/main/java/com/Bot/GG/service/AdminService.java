package com.Bot.GG.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bot.GG.entity.Admin;
import com.Bot.GG.iService.IAdminService;
import com.Bot.GG.repository.AdminRepository;


@Service
public class AdminService implements IAdminService{
	@Autowired
    private AdminRepository aRepository;
	
	public List<Admin> findAllAdmin(){
        return aRepository.findAll();
    };
    
    public Admin saveAdmin(Admin admin){
        return aRepository.save(admin);
    };
    
    
    public void removeAdmin(Admin admin){
        aRepository.delete(admin);
    };


}
