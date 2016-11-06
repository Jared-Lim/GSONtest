package gerson4;

import java.math.BigDecimal;
import java.util.List;

@SuppressWarnings("unused")
public class Staff {
	
	private String name;
	private int age;
	private String position;
	private BigDecimal salary;
	private List<String> skills;
	
	public void setName(String name){this.name=name;}
	public void setAge(int age){this.age=age;}
	public void setPosition(String position){this.position=position;}
	public void setSalary(BigDecimal salary){this.salary=salary;}
	
	
}
