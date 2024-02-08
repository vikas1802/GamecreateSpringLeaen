package com.example.demo.game.run;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.example.demo.game.run.Gamerunner;

@Component
class YourBussinessClass{
	dependency1 dep1;
	dependency2 dep2;
	public String toString() {
		return "using " + dep1 + "  and " + dep2 + " parameters"; 
	}
	
}
@Component
 class dependency1{
	 
 }
@Component
 class dependency2{
	 
 }


@Configuration
@ComponentScan
public class App03BasicJavaSpringBean {
	public static void main(String[] args) {
//		var Context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
//         System.out.println(Context.getBean("name"));
//         System.out.println(Context.getBean("age"));
//         System.out.println(Context.getBean("person"));
//         System.out.println(Context.getBean("Pta"));
//         System.out.println(Context.getBean("per"));
//         System.out.println(Context.getBean("stand"));
//         System.out.println(Context.getBean("stand1"));
//         System.out.println(Context.getBeanDefinitionCount());
//         System.out.println(Context.getBean("addrr"));
//       System.out.println(Context.getBean("addrr1"));
//         System.out.println(Context.getBean(Address.class));
         
//      String bean[]=Context.getBeanDefinitionNames();
//      for(String bname:bean) {
//    	  System.out.println("bean name"+bname);
//      }
        try( var Context2 = new AnnotationConfigApplicationContext(App03BasicJavaSpringBean.class)){
        	 System.out.println(Context2.getBean(YourBussinessClass.class));
        };
//         Gamerunner obj = Context2.getBean("gamerun", Gamerunner.class);
//         Gamerunner obj1 = Context2.getBean("gamerun1", Gamerunner.class);
//         Gamerunner obj2 = Context2.getBean("gamerun2", Gamerunner.class);
//         obj.run();
//         obj1.run();
//         obj2.run();
       
	}
}


