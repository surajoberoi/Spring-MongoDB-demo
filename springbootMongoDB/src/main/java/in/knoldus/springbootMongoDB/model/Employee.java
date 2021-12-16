package in.knoldus.springbootMongoDB.model;

import in.knoldus.springbootMongoDB.validation.Email;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@Document(collection = "StoreEmployees")
public class Employee {

    UUID registrationId;

    @Id
    String id;

    @Email
    String email;

    String name;

    String dept;

}
