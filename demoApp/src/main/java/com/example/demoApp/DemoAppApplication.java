package com.example.demoApp;

import com.example.demoApp.model.Item;
import com.example.demoApp.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DemoAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoAppApplication.class, args);
	}
}
