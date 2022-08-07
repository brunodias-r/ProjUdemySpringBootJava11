package br.com.projetoaula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.projetoaula.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{

}
