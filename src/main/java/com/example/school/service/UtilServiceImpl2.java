package com.example.school.service;

import org.springframework.stereotype.Service;

@Service
public class UtilServiceImpl2 implements UtilService {
    @Override
    public String nameToUpperCase(String name) {
        return name.toLowerCase();
    }

    @Override
    public String nameToLowerCase(String name) {
        return name.toLowerCase();
    }
}
