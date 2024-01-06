package com.example.hhtp_basic.repo;

import com.example.hhtp_basic.model.AppRole;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppRoleRepository extends CrudRepository<AppRole, Long> {
}
