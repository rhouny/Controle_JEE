package org.sid.sevservice.sec.repo;

import org.sid.sevservice.sec.entities.AppRole;
import org.sid.sevservice.sec.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRole,Long> {
    AppRole findByRoleName(String userName);
}
