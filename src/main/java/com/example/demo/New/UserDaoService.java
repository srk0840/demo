package com.example.demo.New;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@Component
public class UserDaoService {


    //creat static list

    private static List<User> users = new ArrayList<>();
    static {
        users.add(new User(1,"SRK", LocalDate.now().minusYears(30)));
        users.add(new User(1,"Noor", LocalDate.now().minusYears(28)));
        users.add(new User(1,"Masood", LocalDate.now().minusYears(25)));
        users.add(new User(1,"Sabir", LocalDate.now().minusYears(22)));
    }

    public List<User> findAll(){
        return users;
    }

    public User findById(int id){
        return users.stream().filter(user -> user.getId().equals(id)).findFirst().get();

    }

}
