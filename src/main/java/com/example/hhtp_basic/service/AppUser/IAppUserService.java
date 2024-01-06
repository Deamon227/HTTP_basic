package com.example.hhtp_basic.service.AppUser;

import com.example.hhtp_basic.model.AppUser;
import com.example.hhtp_basic.service.IGeneratedService;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

public interface IAppUserService extends IGeneratedService<AppUser>, UserDetailsService {
    Optional<AppUser> findByName(String username);
}
