package peaksoft.service;

import peaksoft.dao.UserDao;
import peaksoft.dao.UserDaoHibernateImpl;
import peaksoft.dao.UserDaoJdbcImpl;
import peaksoft.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserDao userDaoHibernate = new UserDaoHibernateImpl();
    UserDao userDaoJdbc = new UserDaoJdbcImpl();

    public void createUsersTable() {
        userDaoHibernate.createUsersTable();
        userDaoJdbc.createUsersTable();
    }

    public void dropUsersTable() {
        userDaoHibernate.dropUsersTable();
        userDaoJdbc.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        userDaoHibernate.saveUser(name, lastName, age);
        userDaoJdbc.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
        userDaoHibernate.removeUserById(id);
        userDaoJdbc.removeUserById(id);
    }

    public List<User> getAllUsers() {
        return userDaoHibernate.getAllUsers();
//        return userDaoJdbc.getAllUsers();
    }

    public void cleanUsersTable() {
        userDaoHibernate.cleanUsersTable();
        userDaoJdbc.cleanUsersTable();
    }
}
