package ua.edu.ucu.apps.FlowerStore.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(path = "student")
public class StudentController {
    private final StudentService studentService;

    @Autowired //для того, щоб зв'язати флаверсервіс з флавер контроллером (рівні архітектури)
	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping
    public void addStudents(@RequestBody Student student) {
        studentService.addStudent(student);
    }

}

