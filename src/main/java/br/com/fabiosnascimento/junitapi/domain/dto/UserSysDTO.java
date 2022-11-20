package br.com.fabiosnascimento.junitapi.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserSysDTO {
    private Integer id;
    private String name;
    private String email;

    @JsonIgnore
    private String password;

}
