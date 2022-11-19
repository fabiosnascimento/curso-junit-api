package br.com.fabiosnascimento.junitapi.services.impl;

import br.com.fabiosnascimento.junitapi.domain.User;
import br.com.fabiosnascimento.junitapi.repositories.UserRepository;
import br.com.fabiosnascimento.junitapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findById(Integer id) {
        Optional<User> obj = userRepository.findById(id);
        return obj.orElse(null);
    }
}
