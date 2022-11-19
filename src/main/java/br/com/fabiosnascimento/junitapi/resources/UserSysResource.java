package br.com.fabiosnascimento.junitapi.resources;

import br.com.fabiosnascimento.junitapi.domain.UserSys;
import br.com.fabiosnascimento.junitapi.services.UserSysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserSysResource {

    @Autowired
    private UserSysService userSysService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<UserSys> findById(@PathVariable Integer id) {
        return ResponseEntity.ok().body(userSysService.findById(id));
    }
}
