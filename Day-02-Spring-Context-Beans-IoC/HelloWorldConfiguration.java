package com.learning.demo.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name,int age,Address address) {};
//Address = firstline & City
record Address(String firstLine,String city) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name(){
		return "Prathamesh";
	}
	@Bean
	public int age() {
		return 20;
	}
	@Bean
	public Person person() {
		return new Person("Bob",20,new Address("Yalhanka","Bangluru"));
	}
	@Bean(name = "address2")
	
	public Address address() {
		return new Address("BSF CIRCLE","Bangluru");
	}
	@Bean(name = "address3")
	@Primary
	@Qualifier("address3qualifier")
	public Address address3() {
		return new Address("Bagluru","Bangluru");
	}
	@Bean
	public Person person2MethodCall() {
		return new Person(name(),age(),address());
	}
	@Bean
	public Person person3Parameter(String name,int age,Address address3) {
		return new  Person(name,age,address3);
	}
	
	@Bean
	
	public Person person4qualifier(String name,int age,@Qualifier("address3qualifier") Address address) {
		return new  Person(name,age,address);
	}

}
