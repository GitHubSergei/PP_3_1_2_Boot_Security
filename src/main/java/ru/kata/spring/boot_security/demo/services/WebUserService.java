package ru.kata.spring.boot_security.demo.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.models.WebUser;

import java.util.List;



public interface WebUserService extends UserDetailsService {


    @Override
    UserDetails loadUserByUsername(String webusername);

    WebUser findUserById(Long userId);

    List<WebUser> allUsers();

    void saveUser(WebUser user);

    void updateUser(long id, WebUser user);

    void deleteUser(Long userId);
}
