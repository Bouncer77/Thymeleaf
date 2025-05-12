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

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
