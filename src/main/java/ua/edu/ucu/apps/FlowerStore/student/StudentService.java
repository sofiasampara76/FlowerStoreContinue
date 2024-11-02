package ua.edu.ucu.apps.FlowerStore.student;
//Business layer
import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public void addStudent(Student student) {
        Optional<Student> existingStudent = studentRepository.findUserByEmail(student.getEmail());

        if (existingStudent.isPresent()) {
            throw new IllegalStateException("A student with this email already exists.");
        }
        
        studentRepository.save(student);
    }

}
