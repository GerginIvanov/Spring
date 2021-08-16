package net.javaguides.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.javaguides.controller.Factory;
import net.javaguides.controller.restaurant;

@SpringBootApplication
public class SpringbootPostgresqlHibernateCrudExercise1Application {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		SpringApplication.run(SpringbootPostgresqlHibernateCrudExercise1Application.class, args);

		ApplicationContext shoeObject = new AnnotationConfigApplicationContext("net.javaguides.controller");
		Factory factoryObject = (Factory) shoeObject.getBean(Factory.class);
		System.out.println(factoryObject.makeShoes());
		
		ApplicationContext restaurantContext = new ClassPathXmlApplicationContext("SpringConfig.xml");
		restaurant restaurantObject = (restaurant) restaurantContext.getBean("restaurantBean");
		
		System.out.printf("Call from restaurantObject: %s%n", restaurantObject.makeDrink());
	}
}