package by.trofimov.spring.dao;

import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import by.trofimov.spring.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import static by.trofimov.spring.util.Constant.*;

@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> employees = jdbcTemplate.query(QUERY_SELECT_ALL_EMPLOYEES, new RowMapper<Employee>() {
            @Override
            public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
                return new Employee(rs.getInt(ROW_ID), rs.getString(ROW_FIRST_NAME),
                        rs.getString(ROW_LAST_NAME), rs.getInt(ROW_SALARY));
            }
        });
        return employees;
    }

}
