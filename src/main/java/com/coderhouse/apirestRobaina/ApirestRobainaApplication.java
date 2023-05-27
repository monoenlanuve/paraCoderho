package com.coderhouse.apirestRobaina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApirestRobainaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApirestRobainaApplication.class, args);
	}

	//Metodo Run  para correr mis sentencias Java
	//@Override
	public void run(String... args) throws Exception {
		System.out.println("Acceda al Server desde aqui..http://localhost:8888/h2-console/login.jsp?");
	}
}