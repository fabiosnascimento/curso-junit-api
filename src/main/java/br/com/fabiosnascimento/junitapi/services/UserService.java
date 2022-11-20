package br.com.fabiosnascimento.junitapi.services;

import br.com.fabiosnascimento.junitapi.domain.User;
import br.com.fabiosnascimento.junitapi.domain.dto.UserDTO;

import java.util.List;

public interface UserService {

    User findById(Integer id);
    public List<User> findAll();
    User create(UserDTO obj);
}
