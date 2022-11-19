package br.com.fabiosnascimento.junitapi.services;

import br.com.fabiosnascimento.junitapi.domain.User;

public interface UserService {

    User findById(Integer id);
}
