package com.example.LazyEagerLoading;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class Vikas{
	
}
@Component
@Lazy
 class Ram{
	 private Vikas vi;
	 public Ram(Vikas vik) {
		 System.out.println("Some Logic Before Intialisating");
		 this.vi=vik;
	 }
	 
	 public void doing() {
		 System.out.println("vikas and ram are brother");
	 }
 }

@Configuration
@ComponentScan
public class LazyEagerLoading {
  public static void main(String [] args) {
    try(var Context = new AnnotationConfigApplicationContext(LazyEagerLoading.class)){
    	System.out.println(Context.getBeanDefinitionCount());
   	Context.getBean(Ram.class).doing();
    }
  }
}
