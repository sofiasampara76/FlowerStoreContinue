package ua.edu.ucu.apps.FlowerStore.student;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

    @Query("SELECT u FROM Student u WHERE u.email = ?1")
    Optional<Student> findUserByEmail(String email);
        //Optional для того, щоб база не повертала null, якщо щось не так
        //Якщо додати цей опшіонал, то його можна обробляти, як звичайного студента
        //Він просто буде видавати "" після getName()

}
