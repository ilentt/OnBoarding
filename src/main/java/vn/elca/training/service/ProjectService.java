package vn.elca.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.elca.training.dao.IProjectRepository;
import vn.elca.training.dom.Project;

@Service
public class ProjectService implements IProjectService {
	@Autowired
	private IProjectRepository projectRepository;

    @Override
    public List<Project> findAll() {
        return projectRepository.findAll();
    }

	@Override
	public List<Project> findProjectByName(String name) {
		// TODO Auto-generated method stub
		return projectRepository.findProjectByName(name);
	}

	@Override
	public Project findOne(Long id) {
		// TODO Auto-generated method stub
		return projectRepository.findOne(id);
	}
    
    
}
