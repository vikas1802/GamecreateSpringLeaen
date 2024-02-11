package com.example.Loadinginscope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class Vikas{
	
}

@Component
@Scope("prototype")
//@Lazy
 class Ram{
	 private Vikas vi;
	 int count = 0;
	 public Ram(Vikas vik) {
		 System.out.println("Some Logic Before Intialisating");
		 this.vi=vik;
	 }
	 @PostConstruct
	 public void doing() {
		 System.out.println(++count);
		 System.out.println("vikas and ram are brother");
	 }
	 @PreDestroy
	 public void full() {
		 System.out.println("Aayushman is best teacher");
	 }
	 
 }

@Configuration
@ComponentScan
public class LoadingScope{
  public static void main(String [] args) {
	  System.out.println("-----------context started----------------");
    try(var Context = new AnnotationConfigApplicationContext(LoadingScope.class)){
    	System.out.println(Context.getBeanDefinitionCount());
   	Context.getBean(Ram.class);
   	Context.getBean(Ram.class);
   	Context.getBean(Ram.class);
    }
    System.out.println("-----------context closing----------------");
  }
}
