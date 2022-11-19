package br.com.fabiosnascimento.junitapi.services.impl;

import br.com.fabiosnascimento.junitapi.domain.UserSys;
import br.com.fabiosnascimento.junitapi.repositories.UserSysRepository;
import br.com.fabiosnascimento.junitapi.services.UserSysService;
import br.com.fabiosnascimento.junitapi.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserSysServiceImpl implements UserSysService {

    @Autowired
    private UserSysRepository userSysRepository;

    @Override
    public UserSys findById(Integer id) {
        Optional<UserSys> obj = userSysRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}
