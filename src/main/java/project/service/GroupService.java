package project.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.dao.GroupDAO;
import project.module.Group;

import java.util.List;

@Service
public class GroupService {

    @Autowired
    private GroupDAO groupDAO;


    @Transactional
    public void addGroup(Group group) {
        groupDAO.saveAndFlush(group);
    }

    @Transactional
    public List<Group> findAll() {
        return groupDAO.findAll();
    }

    @Transactional
    public List<Group> find(long id) {
        return groupDAO.findGroupByTeacherID(id);
    }

    @Transactional
    public List<Group> findByID(String name) {
        return groupDAO.findGroupByID(name);
    }
}
