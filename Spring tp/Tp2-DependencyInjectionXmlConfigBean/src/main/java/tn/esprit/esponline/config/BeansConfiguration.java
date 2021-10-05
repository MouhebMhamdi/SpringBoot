package tn.esprit.esponline.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import tn.esprit.esponline.controller.DependencyController;
import tn.esprit.esponline.repository.DependencyRepository;
import tn.esprit.esponline.service.DependencyService;

@Configuration
public class BeansConfiguration {
	@Bean(name = "dependencyController")
	public DependencyController createDependencyControl() {
	DependencyController depController = new DependencyController();
	return depController;
	}
	
	@Bean(name = "dependencyService")
	public DependencyService createDependencyService() {
	DependencyService depService = new DependencyService();
	return depService;
	}
	
	@Bean(name = "dependencyRepository")
	public DependencyRepository createDependencyRepository() {
	DependencyRepository depRepository = new DependencyRepository();
	return depRepository;
	}
}
