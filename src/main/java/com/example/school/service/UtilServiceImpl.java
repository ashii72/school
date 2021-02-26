package com.example.school.service;

import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class UtilServiceImpl implements UtilService {
    @Override
    public String nameToUpperCase(String name) {
        return name.toUpperCase();
    }

    @Override
    public String nameToLowerCase(String name) {
        return name.toLowerCase();
    }
}
