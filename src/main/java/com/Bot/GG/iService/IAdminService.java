package com.Bot.GG.iService;

import java.util.List;

import com.Bot.GG.entity.Admin;


public interface IAdminService {
	public List<Admin> findAllAdmin();
    public Admin saveAdmin(Admin admin);
    public void removeAdmin(Admin admin);

}
