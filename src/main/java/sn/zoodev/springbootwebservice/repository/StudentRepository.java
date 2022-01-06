package sn.zoodev.springbootwebservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.zoodev.springbootwebservice.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
