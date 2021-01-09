package org.sid.sevservicepart2.sec.service;

import org.sid.sevservicepart2.sec.entities.AppRole;
import org.sid.sevservicepart2.sec.entities.AppUser;

import java.util.List;

public interface AccountService {
    AppUser addNewUser(AppUser appUser);
    AppRole addNewRole(AppRole appRole);
    void addRoleToUser(String username, String roleName);
    AppUser loadUserByUsername(String username);
    List<AppUser> listUsers();
}
