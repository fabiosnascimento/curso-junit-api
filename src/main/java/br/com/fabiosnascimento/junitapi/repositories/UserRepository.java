package br.com.fabiosnascimento.junitapi.repositories;

import br.com.fabiosnascimento.junitapi.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
