//package com.chathumal.jsploginandregistration.config;
//
//import com.chathumal.jsploginandregistration.entity.Product;
//import com.chathumal.jsploginandregistration.entity.Role;
//import com.chathumal.jsploginandregistration.entity.User;
//import com.chathumal.jsploginandregistration.repo.ProductRepo;
//import com.chathumal.jsploginandregistration.repo.RoleRepo;
//import com.chathumal.jsploginandregistration.repo.UserRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//
//import java.util.Set;
//
//@Service
//@Component
//public class DataLoader implements CommandLineRunner {
//
//    @Autowired
//    private  UserRepo userRepository;
//
//    @Autowired
//    private RoleRepo roleRepository;
//
//    @Autowired
//    private ProductRepo productRepository; // Add the ProductRepo
//
//    @Autowired
//    public DataLoader(UserRepo userRepository, RoleRepo roleRepository, ProductRepo productRepository) {
//        this.userRepository = userRepository;
//        this.roleRepository = roleRepository;
//        this.productRepository = productRepository; // Inject the ProductRepo
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        // Insert dummy data for roles
//        Role roleUser = new Role();
//        roleUser.setName("ROLE_USER");
//        roleRepository.save(roleUser);
//
//        Role roleAdmin = new Role();
//        roleAdmin.setName("ROLE_ADMIN");
//        roleRepository.save(roleAdmin);
//
//        Role roleManager = new Role();
//        roleManager.setName("ROLE_MANAGER");
//        roleRepository.save(roleManager);
//
//        // Insert dummy data for users with different roles
//        User user1 = new User();
//        user1.setUsername("user1");
//        user1.setPassword("password");
//        user1.setPasswordConfirm("password");
//        user1.setRoles(Set.of(roleUser));
//        userRepository.save(user1);
//
//        User user2 = new User();
//        user2.setUsername("admin1");
//        user2.setPassword("adminpassword");
//        user2.setPasswordConfirm("adminpassword");
//        user2.setRoles(Set.of(roleAdmin));
//        userRepository.save(user2);
//
//        User user3 = new User();
//        user3.setUsername("manager1");
//        user3.setPassword("managerpassword");
//        user3.setPasswordConfirm("managerpassword");
//        user3.setRoles(Set.of(roleManager));
//        userRepository.save(user3);
//
//        // Insert dummy data for products
//        Product product1 = Product.builder()
//                .name("Product 1")
//                .quantity(10L)
//                .price(100L)
//                .imgUrl("product1.jpg")
//                .build();
//        productRepository.save(product1);
//
//        Product product2 = Product.builder()
//                .name("Product 2")
//                .quantity(20L)
//                .price(200L)
//                .imgUrl("product2.jpg")
//                .build();
//        productRepository.save(product2);
//
//        // Add more products as needed
//    }
//}