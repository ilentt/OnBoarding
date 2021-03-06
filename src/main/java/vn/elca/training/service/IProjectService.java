package vn.elca.training.service;

import java.util.List;

import vn.elca.training.dom.Project;

public interface IProjectService {
    List<Project> findAll();
    Project findOne(Long id);
	List<Project> findProjectByName(String name);
}
