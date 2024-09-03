package com.example.bean.test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;


@FunctionalInterface
interface MyPredicate {
    boolean test(Integer value);
}

@Configuration //la classe stessa diventa la classe di configurazione dei bean
@ComponentScan //permette di cercare tutti i bean definiti
public class BeanInjectionTest {

	public static void main(String[] args) {
		
		//all'application Context va passato, a differenza della vecchia gestione in cui
		// veniva passato un file xml di configurazione, la classe, come annotation @Configuration, che ora definisce la configurazione dei bean 
		//Passando la classe madre, mediante il @ComponentScan tutti i componenti annotati
		//come @Component o come @Bean verranno caricati.
		
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(BeanInjectionTest.class);

		for (String component : ctx.getBeanDefinitionNames()) {
			System.out.println("> bean component present in IOC contanier: " + component);
		}
		
		Function <String,String> a = (data) -> 
		{
			System.out.println(data); 
		    return data.concat(" ECCOMI").toString();
		};
		
		List <String> lista = new ArrayList();
		lista.add("Superman");
		lista.add("Batman");
		lista.add("Acquaman");
		lista.forEach(data -> System.out.println(data));

		System.out.println("belin: " + a.apply("test"));
		
		
		
		
		Customer customer = ctx.getBean(Customer.class);
		customer.setName("Massimo");
		
		CustomerIdentify customerIdentity = customer.componentClass();
		customerIdentity.setIdentity("CAZZO");
		System.out.println(customer.getName());
		
		
		Customer customer2 = ctx.getBean(Customer.class);
		System.out.println(customer2.getName());
		System.out.println("get string from componentClass: " + customer2.componentClass().getIdentity());
		
		
		CustomerIdentify test2 = ctx.getBean(CustomerIdentify.class);
		System.out.println("get string from componentClass directly from ctx: " + test2.getIdentity());

		
		for (String component2 : ctx.getBeanDefinitionNames()) {
			System.out.println("> bean component present in IOC contanier: " + component2);
		}
		
		
		MyPredicate myPredicate = x -> (x + 2) > 5;
        System.out.println(myPredicate.test(2));
        
        Predicate <Integer> test = (i) -> (i > 0);
        
        System.out.println("Predicate test: " +test.test(4));

	}
//	@SuppressWarnings("deprecation")
//	public static void main(String[] args) {
//		Calendar cal = Calendar.getInstance();
//		cal.set(Calendar.HOUR_OF_DAY, 0); // ! clear would not reset the hour of day !
//		cal.clear(Calendar.MINUTE);
//		cal.clear(Calendar.SECOND);
//		cal.clear(Calendar.MILLISECOND);
//
//		String pattern = "MM-dd-yyyy";
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
//		String date = simpleDateFormat.format(new Date());
//		System.out.println("today: "+date);
//		// get start of this week in milliseconds
//		cal.set(Calendar.DAY_OF_WEEK, cal.getFirstDayOfWeek());
//		System.out.println("time: "+cal.getTime().getTimezoneOffset());
//		System.out.println("Start of this week:       " + cal.getTime());
//		System.out.println("... in milliseconds:      " + cal.getTimeInMillis());
//	}

}
