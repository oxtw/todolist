package br.com.migueljava.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
//classe de usuario
@Data
@Entity(name = "tb_users")//nome da tabela no h2
public class UserModel {
    
    @Id
    @GeneratedValue(generator = "UUID")//UUID feito para criar um ID aleatorio, sendo assim mais seguro que o sequencial
    private UUID id;

    @Column(unique = true)//será uma coluna com uma constrain única(username único)
    private String username;
    private String name;
    private String password;

    @CreationTimestamp//Criado em
    private LocalDateTime createdAt;
    // getters e setters

    }

