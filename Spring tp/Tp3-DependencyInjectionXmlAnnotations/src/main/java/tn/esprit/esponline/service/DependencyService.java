package tn.esprit.esponline.service;

import java.awt.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.esponline.repository.IDependencyRepository;

@Service
public class DependencyService implements IDependencyService{

	@Autowired
	private IDependencyRepository myRepository;

	public IDependencyRepository getMyRepository() {
	return myRepository;
	}
	public void setMyRepository(IDependencyRepository myRepository) {
	this.myRepository = myRepository;
	}
	
}
