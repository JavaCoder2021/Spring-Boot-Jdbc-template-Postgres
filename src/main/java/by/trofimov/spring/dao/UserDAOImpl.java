package by.trofimov.spring.dao;

import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

import by.trofimov.spring.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> employees = jdbcTemplate.query("SELECT * FROM company_storage.employee", new RowMapper<Employee>() {
            @Override
            public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
                return new Employee(rs.getInt("id"), rs.getString("first_name"),
                        rs.getString("last_name"), rs.getInt("salary"));
            }
        });
        return employees;
    }

}
