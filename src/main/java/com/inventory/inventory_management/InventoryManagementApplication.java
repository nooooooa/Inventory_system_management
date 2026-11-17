package com.inventory.inventory_management;
import com.inventory.inventory_management.repository.ProductRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import javax.sql.DataSource;
import java.sql.Connection;

@SpringBootApplication
public class InventoryManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryManagementApplication.class, args);
	}
	@Bean
	CommandLineRunner testDatabaseConnection(
			ProductRepository productRepository) {

		return args -> {
			System.out.println("==============================");
			System.out.println("DATABASE CONNECTION SUCCESS!");
			System.out.println("Total Products: "
					+ productRepository.count());
			System.out.println("==============================");
		};
	}
}