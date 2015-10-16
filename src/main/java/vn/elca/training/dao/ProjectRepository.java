package vn.elca.training.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import com.mysema.query.types.OrderSpecifier;
import com.mysema.query.types.Predicate;

import vn.elca.training.dom.Project;

@Repository
public class ProjectRepository implements IProjectRepository {

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteInBatch(Iterable<Project> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Project> findAll() {
		// TODO Auto-generated method stub
		Project pro1 = new Project((long) 1, "SecuTix", new Date()); 
		Project pro2 = new Project((long) 2, "PaKT", new Date());
		Project pro3 = new Project((long) 3, "ViKOST", new Date());
		List<Project> list = new ArrayList<Project>();
		list.add(pro1);
		list.add(pro2);
		list.add(pro3);
		return list;
	}

	@Override
	public List<Project> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Project> findAll(Iterable<Long> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Project> findAllByName(String name) {
		// TODO Auto-generated method stub
		List<Project> list = new ArrayList<Project>();
		if(!name.isEmpty()) {
			for(Project pro : findAll()) {
				if(pro.getName().toLowerCase().equals(name.toLowerCase()) || pro.getName().toLowerCase().contains(name.toLowerCase())) {
					list.add(pro);
				}
			}
			return list;
		}
		return findAll();
	}
	
	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Project getOne(Long arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Project> List<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Project> S saveAndFlush(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Project> findAll(Pageable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Long arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Project arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Project> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(Long arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Project findOne(Long id) {
		// TODO Auto-generated method stub
		for(Project pro : findAll()) {
			if(pro.getId() == id) {
				return pro;
			}
		}
		return null;
	}

	@Override
	public <S extends Project> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count(Predicate arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Iterable<Project> findAll(Predicate arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Project> findAll(Predicate arg0, OrderSpecifier<?>... arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Project> findAll(Predicate arg0, Pageable arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Project findOne(Predicate arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
