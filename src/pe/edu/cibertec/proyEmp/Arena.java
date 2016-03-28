package pe.edu.cibertec.proyEmp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Arena {
	
	public static void main(String[] args) {	
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
		 								//id 
		Ninja ninja  = (Ninja) context.getBean("ninja");
		Enemigo enemigo = new Enemigo();
		ninja.ataca(enemigo);
	}
	
}
