package com.example.SpringBeanScoping;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
class Normal{
	
}
@Component
@Scope("prototype")
class Proper{
	
}
@Configuration
@ComponentScan
public class SpringScope {
public static void main(String[]args) {
	try(var Context = new AnnotationConfigApplicationContext(SpringScope.class)){
//		Arrays.stream(Context.getBeanDefinitionNames()).forEach(System.out::println);
//		System.out.println();
		
		System.out.println(Context.getBean(Normal.class).hashCode());
		System.out.println(Context.getBean(Normal.class).hashCode());
		System.out.println(Context.getBean(Normal.class).hashCode());
		
		System.out.println();
		
		System.out.println(Context.getBean(Proper.class).hashCode());
		System.out.println(Context.getBean(Proper.class).hashCode());
		System.out.println(Context.getBean(Proper.class).hashCode());
	}
}
}
