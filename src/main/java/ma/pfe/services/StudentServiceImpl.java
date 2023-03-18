package ma.pfe.services;


import ma.pfe.dtos.StudentDto;
import ma.pfe.entities.StudentEntity;
import ma.pfe.mappers.StudentMapper;
import ma.pfe.repositories.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentServiceImpl implements StudentService{
    private final static Logger LOGGER = LoggerFactory.getLogger(StudentServiceImpl.class);
    @Autowired
    private StudentRepository studentRepository;
    @Autowired

    private StudentMapper mapper;

    @Override
    public StudentDto saveOrUpdate(StudentDto dto) {
        LOGGER.debug("start method save");
        StudentEntity e=mapper.convertToEntity(dto);
        return mapper.convertToDto(studentRepository.save(e));
    }


    @Override
    public void deleteByID(Long id) {
        LOGGER.debug("start method deleteByiD");
        this.studentRepository.deleteById(id);
    }

    @Override
    public List<StudentDto> selectALL() {
        LOGGER.debug("start method selectALL");
        List<StudentEntity>l=this.studentRepository.findAll();
        List<StudentDto>ld=mapper.convertToDtos(l);
        return ld;

    }
}
