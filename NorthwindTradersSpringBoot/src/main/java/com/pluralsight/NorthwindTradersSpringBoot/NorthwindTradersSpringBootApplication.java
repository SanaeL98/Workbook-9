package com.pluralsight.NorthwindTradersSpringBoot;

import com.pluralsight.NorthwindTradersSpringBoot.model.Product;
import com.pluralsight.NorthwindTradersSpringBoot.repositories.SimpleProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class NorthwindTradersSpringBootApplication implements CommandLineRunner {

	@Autowired
	private SimpleProductDao productDao;

	public static void main(String[] args) {
		SpringApplication.run(NorthwindTradersSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Product> products = productDao.getAll();
		System.out.println(products);
	}
}
