package com.example.bean.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

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
		
		ComponentClass2 customer = ctx.getBean(ComponentClass2.class);
		customer.setName("Massimo");
		System.out.println(customer.getName());
		ComponentClass2 customer2 = ctx.getBean(ComponentClass2.class);
		System.out.println(customer2.getName());
		

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
