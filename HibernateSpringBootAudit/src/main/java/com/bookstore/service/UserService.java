package com.bookstore.service;

import java.util.Arrays;
import java.util.Random;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String getCurrentUserName() {
        // use Spring Security to retrieve the current user
        return Arrays.asList("mark1990", "adrianm", "dan555").get(new Random().nextInt(3));
    }
}
