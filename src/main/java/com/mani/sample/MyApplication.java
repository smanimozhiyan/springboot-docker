package com.mani.sample;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyApplication implements CommandLineRunner{
	public static void main(String[] args) {
		SpringApplication.run(MyApplication.class, args);
	}

	public void run(String... args) throws Exception {
//		String m = "Mani, Mozhiyan ";		
//		System.out.println(m.replace(",", ""));
//		String date = "Dec 31, 3000 12:00:00 AM";
//		
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d, yyyy hh:mm:ss a");
//		DateTimeFormatter output = DateTimeFormatter.ofPattern("MM/dd/yyyy");
//		System.out.println(LocalDateTime.parse(date,formatter).format(output));
	}
	
}
