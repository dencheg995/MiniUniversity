package project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.dao.GroupDAO;
import project.dao.StudentsDAO;
import project.module.Group;
import project.module.Students;

import java.util.List;

@Service
public class StudentsService {


    @Autowired
    private StudentsDAO studentsDAO;


    @Transactional
    public void addGroup(Students student) {
        studentsDAO.saveAndFlush(student);
    }

    @Transactional
    public List<Students> findAll() {
        return studentsDAO.findAll();
    }
}
