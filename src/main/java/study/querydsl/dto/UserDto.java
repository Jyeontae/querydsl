package study.querydsl.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDto {

    private String name;
    private String age;


    public UserDto(String name, String age) {
        this.name = name;
        this.age = age;
    }
}
