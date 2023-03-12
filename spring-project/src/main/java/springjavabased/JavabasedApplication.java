package springjavabased;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavabasedApplication {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavabasedConfiguration.class);
		Department dept = (Department) ctx.getBean("getDept");  //"getDept" is the method name in config class
		System.out.println(dept.getDno()+" "+dept.getDname()+" "+dept.getTeacher().getTname());
		Teacher t = ctx.getBean("teacher",Teacher.class);     //"teacher" is the method name in config class
		System.out.println(t.getTid()+" "+t.getTname());
	}
}
