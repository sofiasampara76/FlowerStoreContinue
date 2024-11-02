package ua.edu.ucu.apps.FlowerStore.student;

import java.time.LocalDate;
import java.time.Period;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Table
@Entity
public class Student {
    @Id
    private Long Id;

    @Column(unique = true)
    private String email;

    private String name;
    private String gender;

    @Transient
    private int age;
    private LocalDate dob;

    //Додати свої методи getAge і SetAge, щоб рахувати правильний вік
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        return Period.between(this.dob, currentDate).getYears();
    }
}