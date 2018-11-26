package project.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import project.module.Group;
import project.module.Students;
import project.module.Teacher;
import project.service.GroupService;
import project.service.StudentsService;
import project.service.TeacherService;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    private GroupService groupService;

    @Autowired
    private TeacherService teacherService;

    @Autowired
    private StudentsService studentsService;

    @GetMapping("/listGroup")
    public List<Group> listGroup() {
        return groupService.findAll();
    }

    @GetMapping("/listGroup2/{id}")
    public List<Group> groupList(@PathVariable("id") long id) {
        return groupService.find(id);
    }


    @GetMapping("/listGroup3/{name}")
    public List<Group> groupListByName(@PathVariable("name") String name) {
        return groupService.findByID(name);
    }

    @GetMapping("/listStudents/{name}")
    public List<Teacher> groupStudentsByName(@PathVariable("name") String name) {
        return teacherService.listTecher(name);
    }
}
