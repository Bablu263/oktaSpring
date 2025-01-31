package com.example.React_Crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReactCrudApplication implements CommandLineRunner {

    @Autowired
	PersonController personController;

	public static void main(String[] args) {
		SpringApplication.run(ReactCrudApplication.class, args);
	}
	    public void run(String... args) throws Exception {
        // Logic to execute on application startup
        System.out.println("Initializing database with sample data.");
        // Print out all persons to confirm
    }


}
