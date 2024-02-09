package task;

import java.util.*;

public class UserManager {
    private List<User> userList;

    public UserManager() {
        userList = new ArrayList<>();
    }

    public void creatUser(int id, String name, int age, String email, String adress) {
        User user = new User(id, name, age, email, adress);
        userList.add(user);
    }

    public User getUser(int id) {
        for (User result : userList) {
            if (result.getId() == id) {
                return result;
            }
        }
        return null;
    }

    public void UpdateUser(User updateUser) {
        for (int i = 0; i < userList.size(); i++) {
            User user = userList.get(i);
            if (user.getId() == updateUser.getId()) {
                userList.set(i, updateUser);
                break;
            }
        }
    }

    public void removeUser(int id) {
        for (int i = 0; i < userList.size(); i++) {
            User us = userList.get(i);
            if (us.getId() == id) {
                userList.remove(i);
                break;
            }
        }
    }

    public List<User> sortListName() {
        Collections.sort(userList, Comparator.comparing(User::getName));
        return userList;
    }

    public List<User> sortListAdress() {
        Collections.sort(userList, Comparator.comparing(User::getAdress));
        return userList;
    }
    public void  konsol(){
        System.out.println(userList);
    }
}
