package tn.esprit.esponline;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tn.esprit.esponline.controller.DependencyController;

public class Main {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		System.out.println("Contains dependencyController " +context.containsBeanDefinition("dependencyController"));
		
		System.out.println("Contains dependencyService " +context.containsBeanDefinition("dependencyService"));
		
		System.out.println("Contains dependencyRepository " +context.containsBeanDefinition("dependencyRepository"));

		}
}
