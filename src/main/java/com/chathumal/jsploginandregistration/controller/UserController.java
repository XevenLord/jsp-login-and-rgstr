package com.chathumal.jsploginandregistration.controller;

import com.chathumal.jsploginandregistration.entity.Product;
import com.chathumal.jsploginandregistration.entity.Role;
import com.chathumal.jsploginandregistration.entity.User;
import com.chathumal.jsploginandregistration.service.ProductService;
import com.chathumal.jsploginandregistration.service.UserService;
import com.chathumal.jsploginandregistration.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

/**
 * @author Chathumal Jayasingha | [chathumaljayasingha@hotmail.com]
 * @since - 3/25/22 | 2022-March-25[Friday]
 */

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private ProductService productService;


    @Autowired
    private UserValidator userValidator;

    @GetMapping("/registration")
    public String registration(Model model) {
        model.addAttribute("userForm", new User());
        return "registration";
    }

    @PostMapping("/registration")
    public String registrationUser(@ModelAttribute("userForm") User userForm, BindingResult bindingResult) {
        userValidator.validate(userForm, bindingResult);

        if (bindingResult.hasErrors()) {
            return "registration";
        }
        Role roleUser = new Role();
        roleUser.setName("ROLE_USER");
        userForm.setRoles(Set.of(roleUser));
        userService.save(userForm);

        return "redirect:/welcome";
    }

    @GetMapping("/login")
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("error", "Your username and password is invalid.");

        if (logout != null)
            model.addAttribute("message", "You have been logged out successfully.");

        return "login";
    }

    @GetMapping({"/", "/welcome"})
    public String welcome(Model model) {
        List<User> userList = userService.findAll();
        List<Product> productList = productService.getAllProducts();
        model.addAttribute("userList", userList);
        model.addAttribute("productList", productList);
        return "welcome";
    }

}
