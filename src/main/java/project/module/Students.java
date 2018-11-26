package project.module;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "students", schema = "student_db")
public class Students implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_students")
    private long id;

    @Column(name = "student_name")
    private String studentName;

    @Column(name = "student_age")
    private String studentAge;

    @Column(name = "group_id_group",updatable=false, insertable = false)
    private long groupId;

    @Column(name = "teacher1_id_teacher",updatable=false, insertable = false)
    private long teacherId;


    @ManyToOne
    @JsonBackReference
    private Group group;

    @ManyToOne
    @JsonBackReference
    private Teacher teacher1;


    public Students() {
    }

    public long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(long teacherId) {
        this.teacherId = teacherId;
    }

    public Teacher getTeacher1() {
        return teacher1;
    }

    public void setTeacher1(Teacher teacher1) {
        this.teacher1 = teacher1;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getGroupId() {
        return groupId;
    }

    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(String studentAge) {
        this.studentAge = studentAge;
    }
}
