package project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.dao.TeacherDAO;
import project.module.Teacher;

import java.util.List;

@Service
public class TeacherService {


    @Autowired
    private TeacherDAO teacherDAO;

    @Transactional
    public List<Teacher> listTecher(String name) {
        return teacherDAO.listTeacherById(name);
    }
}
