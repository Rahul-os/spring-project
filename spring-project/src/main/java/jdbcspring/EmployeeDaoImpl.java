package jdbcspring;

import java.util.Date;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

// spring + jdbc
// spring jdbc

public class EmployeeDaoImpl {  
	private JdbcTemplate jdbcTemplate;           //jdbc template will internally provide all the 7 steps i.e, connections for db
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate = jdbcTemplate;
	} 
	 
	public int addEmployee(Employee emp) {
		//using spring + jdbc
		String sql = "insert into employee values(?,?,?,?)";
//		emp.setEmpcode(103);
//		emp.setEmpname("Raunak");  adding the values manually using setter methods just by creating object for Student class.
//		emp.setSalary(89424);
//		emp.setDoj(new Date());
		int rows = jdbcTemplate.update(sql , 
				new Object[] {emp.getEmpcode(),emp.getEmpname(),emp.getSalary(),
						emp.getDoj()}); 

		return rows;
		}
				
		
		
		
	
	
	public List<Employee> getEmpls(){
		String qry = "select * from employee";
		List<Employee> emplist = jdbcTemplate.query(qry ,  new BeanPropertyRowMapper<Employee>(Employee.class));
		return emplist;
	}
	
	public Employee getEmpbyId(int id) {
		String qry = "select * from employee where empcode=?";
		Employee emp = jdbcTemplate.queryForObject(qry, new Object[] {id},new BeanPropertyRowMapper<Employee>(Employee.class));
		return emp;
	}
	
	public int delEmployee(Employee emp) { 
		String qry = "delete from employee where empcode=?";
		int rows = jdbcTemplate.update(qry, 33);
		return rows;
	 } 
//	   while using delEmployee() method no need to pass emp object we can directly delete by passing the empcode
	
		int updateEmployee(Employee emp1)
		{
			String qry1 = "update employee set empname = ?,salary =?,doj =? where empcode = ?";
			
			int rows1 = jdbcTemplate.update(qry1, emp1.getEmpname(),emp1.getSalary(),
					emp1.getDoj(),emp1.getEmpcode());
			return rows1;
			
		}
		
		
}





