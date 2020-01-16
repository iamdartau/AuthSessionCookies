package dao;

import models.User;

import java.util.ArrayList;

public class DBmanager {

    private static ArrayList<User> users = new ArrayList<>();

    static {
        users.add(new User("Alex WhyLex", "alex", "123", 2));
        users.add(new User("Dauren WhyMan", "dauren", "123", 1));
        users.add(new User("John Whyon", "john", "123", 3));
        users.add(new User("Asel WhySel", "asel", "123", 1));
    }

    public static ArrayList<User> getAllUsers(){
        return users;
    }

    public static User getUserByLogin(String login){
        for (User user : users
             ) {
            if(login.equals(user.getLogin())){
                return user;
            }
        }return null;
    }
}
