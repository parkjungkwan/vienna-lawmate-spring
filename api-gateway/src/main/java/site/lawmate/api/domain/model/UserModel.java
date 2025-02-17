package site.lawmate.api.domain.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import site.lawmate.api.domain.vo.Registration;
import site.lawmate.api.domain.vo.Role;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
    private String id;
    private String email;
    private String name;
    private String profile;
    private List<Role> roles;
    private Registration registration;
}
