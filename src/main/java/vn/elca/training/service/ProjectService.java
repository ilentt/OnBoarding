package vn.elca.training.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import vn.elca.training.dao.IProjectRepository;
import vn.elca.training.dom.Project;

@Service
public class ProjectService implements IProjectService {
    private IProjectRepository projectRepository;

    @Override
    public List<Project> findAll() {
        Date date = new Date();
        System.out.println(date);
        Project project = new Project("My project", date);
        System.out.println(project.getName());
        List<Project> list = new ArrayList<Project>();
        list.add(project);
        System.out.println(list.size());
        projectRepository.findAll().addAll(list);
        System.out.println(projectRepository.findAll().size());
        return projectRepository.findAll();
    }

    public static void main(String[] args) {
        ProjectService p = new ProjectService();
        p.findAll();
    }
}
