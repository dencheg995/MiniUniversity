package project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import project.module.Group;

import java.util.List;

@Repository
@Transactional
public interface GroupDAO extends JpaRepository<Group, Long> {

    @Query("select group.nameGroup from Group group where group.teacherId =:teacherId")
    List<Group> findGroupByTeacherID(@Param("teacherId") long id);

    @Query("select group.studentsSet from Group group where group.nameGroup =:groupNameGroup")
    List<Group> findGroupByID(@Param("groupNameGroup") String name);
}
