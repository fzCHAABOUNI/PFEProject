package ma.pfe.services;

import ma.pfe.dtos.StudentDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    StudentDto saveOrUpdate(StudentDto dto);

    void deleteByID(Long id);

    List<StudentDto> selectALL();
}


