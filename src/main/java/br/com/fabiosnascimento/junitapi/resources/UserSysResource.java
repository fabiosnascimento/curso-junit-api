package br.com.fabiosnascimento.junitapi.resources;

import br.com.fabiosnascimento.junitapi.domain.dto.UserSysDTO;
import br.com.fabiosnascimento.junitapi.services.UserSysService;
import org.modelmapper.ModelMapper;
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
    private ModelMapper mapper;

    @Autowired
    private UserSysService userSysService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<UserSysDTO> findById(@PathVariable Integer id) {
        return ResponseEntity.ok().body(mapper.map(userSysService.findById(id), UserSysDTO.class));
    }
}
