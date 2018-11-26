package project.module;


import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "teachers", schema = "student_db")
public class Teacher implements Serializable {

    @Id
    @Column(name = "id_teacher", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "teacher_name")
    private String nameTeacher;

    @OneToMany(mappedBy = "teacher")
    @JsonManagedReference
    private Set<Group> groupSet = new HashSet<>();

    @OneToMany(mappedBy = "teacher1")
    @JsonManagedReference
    private Set<Students> studentsSet = new HashSet<>();

    public Teacher() {
    }

    public Set<Students> getStudentsSet() {
        return studentsSet;
    }

    public void setStudentsSet(Set<Students> studentsSet) {
        this.studentsSet = studentsSet;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    public Set<Group> getGroupSet() {
        return groupSet;
    }

    public void setGroupSet(Set<Group> groupSet) {
        this.groupSet = groupSet;
    }
}
