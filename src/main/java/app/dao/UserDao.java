package app.dao;

import app.model.User;

import java.util.List;

public interface UserDao {
    public void addUser(User user);
    public List<User> getAllUser();
    public void deleteUserById(Long id);
    public void updateUser(User user);
    public User getUser(Long id);
}
