package in.knoldus.springbootMongoDB.DTO;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class ResponseDTO<T> {
    String message;
    Boolean status;
    T data;
}
