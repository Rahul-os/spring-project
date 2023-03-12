package springjavabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class JavabasedConfiguration { 
	
	@Bean
	public Department getDept() {
		Department dept = new Department();
		dept.setDno(10);
		dept.setDname("Testing");
		//dept.setTeacher(this.teacher());
		return dept;
	}
	@Bean
	public Teacher teacher()
	{
		Teacher tec = new Teacher();
		tec.setTid(100);
		tec.setTname("Ravi");
		return tec;
	}

}
