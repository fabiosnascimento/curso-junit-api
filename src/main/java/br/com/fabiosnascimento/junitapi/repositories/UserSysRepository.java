package br.com.fabiosnascimento.junitapi.repositories;

import br.com.fabiosnascimento.junitapi.domain.UserSys;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserSysRepository extends JpaRepository<UserSys, Integer> {
}
