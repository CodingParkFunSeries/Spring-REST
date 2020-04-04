package com.example.application1.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public boolean isValidUser(String userName, String password) {

        return "ajay".equalsIgnoreCase(userName) && "test".equalsIgnoreCase(password);

    }

}
