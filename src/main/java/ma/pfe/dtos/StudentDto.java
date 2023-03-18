package ma.pfe.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentDto {

        private Long id;
        private String name;



    @Override
    public String toString() {
        return "StudentDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

