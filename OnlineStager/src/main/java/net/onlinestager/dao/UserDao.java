package net.onlinestager.dao;



import net.onlinestager.model.User;

import java.util.List;

/**
 * Created by Роман on 20.11.2016.
 */
public interface UserDao {
    public void addUser(User user);
    public void updateUser(User user);
    public void removeUser(int id);
    public User getUserById(int id);

    public List<User> listUsers();


}
