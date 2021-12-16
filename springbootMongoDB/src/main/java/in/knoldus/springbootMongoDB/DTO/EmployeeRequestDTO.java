package in.knoldus.springbootMongoDB.DTO;

import in.knoldus.springbootMongoDB.validation.Email;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class EmployeeRequestDTO {

    UUID registrationId;

    String id;

    @Email
    String email;

    String name;

    String dept;

}
