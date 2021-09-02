package net.api.exercise.Repository;

import net.api.exercise.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> { //Entity name and ID datatype as generics
}
