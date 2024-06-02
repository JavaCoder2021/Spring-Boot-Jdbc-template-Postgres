package by.trofimov.spring.service;

import java.util.List;
import by.trofimov.spring.dao.UserDAO;
import by.trofimov.spring.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public List<Employee> getAllEmployees() {
        return userDAO.getAllEmployees();
    }

}
