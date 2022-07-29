package com.example.demo;

//import org.apache.log4j;
import org.springframework.*;
//import org.apache.log4j.Logger;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NuevoApplication implements CommandLineRunner{

//	private static Logger logg = Logger.getLogger(NuevoApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(NuevoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
