package dao;

import model.User;

import java.util.List;

/**
 * 30.11.2020
 *
 * @author MescheRGen
 */

public interface UserDao extends Dao<User> {

    @Override
    void add(User user);

    @Override
    List<User> getAsList();

    @Override
    void remove(User user);
}
