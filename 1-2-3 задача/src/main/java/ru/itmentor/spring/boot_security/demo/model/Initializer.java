//package ru.itmentor.spring.boot_security.demo.model;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Component;
//import ru.itmentor.spring.boot_security.demo.model.Role;
//import ru.itmentor.spring.boot_security.demo.model.User;
//import ru.itmentor.spring.boot_security.demo.services.RoleService;
//import ru.itmentor.spring.boot_security.demo.services.UserService;
//
//import javax.annotation.PostConstruct;
//import java.util.HashSet;
//import java.util.Set;
//
//@Component
//public class Initializer {
//
//    private final RoleService roleService;
//    private final UserService userService;
//    private final PasswordEncoder passwordEncoder;
//
//    @Autowired
//    public Initializer(RoleService roleService, UserService userService, PasswordEncoder passwordEncoder) {
//        this.roleService = roleService;
//        this.userService = userService;
//        this.passwordEncoder = passwordEncoder;
//    }
//
//    @PostConstruct
//    public void init() {
//        // Создаем роли
//        Role adminRole = new Role("ROLE_ADMIN");
//        Role userRole = new Role("ROLE_USER");
//
//        // Сохраняем роли в базу данных
//        roleService.saveRole(adminRole);
//        roleService.saveRole(userRole);
//
//        // Создаем пользователей
//        User adminUser = new User("admin", 30, "admin@example.com", passwordEncoder.encode("admin"), new HashSet<>(Set.of(adminRole)));
//        User regularUser = new User("user", 25, "user@example.com", passwordEncoder.encode("user"), new HashSet<>(Set.of(userRole)));
//
//        // Сохраняем пользователей в базу данных
//        userService.createUser(adminUser);
//        userService.createUser(regularUser);
//    }
//}