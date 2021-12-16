package in.knoldus.springbootMongoDB.DTO;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class EmployeeResponseDTO {

    String id;

    String email;

    String name;

    String dept;

}
