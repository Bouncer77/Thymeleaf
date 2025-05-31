package pro.kosenkov.inventory.web.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.FieldNameConstants;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EmployeeDto {

    String firstName;
    String lastName;
    String email;
    Gender gender;
    AccessRole role;

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public boolean isMan() {
        return this.gender.equals(Gender.MALE);
    }

    public boolean isAdmin() {
        return this.role == AccessRole.ADMIN;
    }

    public boolean isUser() {
        return this.role == AccessRole.USER;
    }

    public boolean isModerator() {
        return this.role == AccessRole.MODERATOR;
    }

    public boolean isNotAuthorized() {
        return this.role == AccessRole.NOT_AUTHORIZED;
    }
}
