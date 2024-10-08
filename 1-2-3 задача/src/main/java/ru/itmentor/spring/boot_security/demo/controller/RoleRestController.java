package ru.itmentor.spring.boot_security.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.itmentor.spring.boot_security.demo.model.Role;
import ru.itmentor.spring.boot_security.demo.services.RoleServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/api/roles")
public class RoleRestController {

    @Autowired
    private RoleServiceImpl roleService;

    @GetMapping
    public List<Role> getAllRoles() {
        return roleService.findAllRoles();
    }

    @PostMapping
    public Role createRole(@RequestBody Role role) {
        roleService.saveRole(role);
        return role;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRole(@PathVariable int id) {
        // Здесь нужно добавить логику удаления роли, если это поддерживается в вашем сервисе
        return ResponseEntity.noContent().build();
    }
}