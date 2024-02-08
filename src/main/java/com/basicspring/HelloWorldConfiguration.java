package com.basicspring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

record Person(String name, int age) {};
record Address(String town, String city, Standard stand) {};
record Standard(String profession,int salary) {};

public class HelloWorldConfiguration {
	@Bean
	public String name() {
		return "nisha";
	}
	@Bean
	public int age() {
		return 27;
	}

	@Bean
	public String town() {
		return "jhadla";
	}
	@Bean
	public String city() {
		return "UP";
	}
	@Bean
	public Person person() {
		return new Person("Shubham",26);
	}
	@Bean(name="Pta")
	@Primary
	public Address add() {
		return new Address("Peeplu","Rajasthan", new Standard("Developer",10000));
	}
	@Bean
	public Person per() {
		return new Person(name(), age());
	}
	@Bean
	public Standard stand() {
		return new Standard("CA",50000);
	}
	@Bean
	public Standard stand1() {
		return new Standard("CMA",30000);
	}

	@Bean
	
	public Address addrr() {
		return new Address(town(), city() , stand1());
	}
	
	@Bean
	public Address addrr1(String town, String city, Standard stand) {
		return new Address(town, city , stand);
	}

    
}
