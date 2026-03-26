package com.example.PhongPhan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class PhongPhanApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhongPhanApplication.class, args);
	}
	@GetMapping("/")
    public String index() {
        return "index";
    }

}
