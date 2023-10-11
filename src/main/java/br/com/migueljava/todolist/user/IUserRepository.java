package br.com.migueljava.todolist.user;

import java.util.UUID;

import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//Classe de repositorio do Usuário com JPA
@Repository
public interface IUserRepository extends JpaRepository <UserModel, UUID>{
    UserModel findByUsername(String username);//metodo para buscar por usuário.
}
