package tn.esprit.esponline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import tn.esprit.esponline.service.IDependencyService;

@Controller
public class DependencyController {
	
	@Autowired
	private IDependencyService myService;

	public IDependencyService getMyService() {
	return myService;
	}

	public void setMyService(IDependencyService myService) {
	this.myService = myService;
	}

}
