package br.com.fabiosnascimento.junitapi.config;

import br.com.fabiosnascimento.junitapi.domain.UserSys;
import br.com.fabiosnascimento.junitapi.repositories.UserSysRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserSysRepository userSysRepository;

    @Bean
    public void startDB() {
        UserSys u1 = new UserSys(null, "Fabio", "fabio@mail.com", "123");
        UserSys u2 = new UserSys(null, "Luiz", "luiz@mail.com", "123");

        userSysRepository.saveAll(List.of(u1, u2));
    }
}
