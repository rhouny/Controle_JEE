package org.sid.sevservicepart2.sec.repo;

import org.sid.sevservicepart2.sec.entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRole,Long> {
    AppRole findByRoleName(String userName);
}
