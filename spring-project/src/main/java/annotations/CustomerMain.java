package annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerMain { 
	public static void main(String[] args) {
	ApplicationContext ctx = new ClassPathXmlApplicationContext("Annotations.xml");
	Customer cust = ctx.getBean("cust",Customer.class);
	
	System.out.println(cust.getCode()+" "+cust.getCustname()+" "+cust.getAccount().getAccountno());
}

}
