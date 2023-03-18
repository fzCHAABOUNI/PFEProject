package ma.pfe.controllers;

import ma.pfe.dtos.StudentDto;
import ma.pfe.services.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final static Logger LOGGER= LoggerFactory.getLogger(StudentController.class);

    @Autowired
    private StudentService studentService;



    @PostMapping
    public StudentDto save(@RequestBody  StudentDto dto) {
        LOGGER.debug("start method save dto : {} ",dto);
        return studentService.saveOrUpdate(dto);
    }

    @PutMapping
    public StudentDto update(@RequestBody StudentDto dto) {
        LOGGER.debug("start method update dto : {} ",dto);
        return studentService.saveOrUpdate(dto);
    }

    @DeleteMapping("/{ids}")
    public void delete(@PathVariable("ids") Long id) {
        LOGGER.debug("start method delete id : {} ",id);
        studentService.deleteByID(id);
    }

    @GetMapping
    public List<StudentDto> selectAll() {
        LOGGER.debug("start method select All");
        return studentService.selectALL();
    }

}
