package by.trofimov.spring.controller;

import java.util.List;
import org.springframework.ui.Model;
import by.trofimov.spring.entity.Employee;
import by.trofimov.spring.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String index(Model model) {
        List<Employee> employees = userService.getAllEmployees();
        model.addAttribute("employees", employees);
        return "index";
    }

}
