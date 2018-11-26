package project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import project.module.Students;

@Repository
@Transactional
public interface StudentsDAO extends JpaRepository<Students, Long> {
}
