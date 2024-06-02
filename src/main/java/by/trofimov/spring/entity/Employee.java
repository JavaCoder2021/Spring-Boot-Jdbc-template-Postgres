package by.trofimov.spring.entity;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

import static com.fasterxml.jackson.core.JsonPointer.SEPARATOR;

public class Employee implements Serializable {

    @Serial
    private final static long serialVersionUID = 1L;
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee() {
    }

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, salary);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        return id == employee.id && salary == employee.salary && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public String toString() {
        return id + SEPARATOR + firstName + SEPARATOR + lastName + SEPARATOR + salary;
    }

}
