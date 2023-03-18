package ma.pfe.entities;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "student")
@Getter
@Setter
public class StudentEntity implements Serializable {

    @Id
    @Column
    private long studentId;

    @Column
    private String name;


    @Override
    public String toString() {
        return "StudentEntity{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                '}';
    }
}
