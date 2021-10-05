package tn.esprit.esponline.repository;

import org.springframework.stereotype.Repository;

@Repository
public class DependencyRepository implements IDependencyRepository{

	public void Rep() {
		System.out.println("rep1");
	}

	
}
