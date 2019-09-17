package com.anuj;

public class Test {

	private static DAO dao=new DAO();
	
	public static void main(String[] args) {
		
		Project p1=new Project("P111","AcSw",5);
		Project p2=new Project("P112","InvSw",6);
		Project p3=new Project("P113","BnkSw",7);
		Project p4=new Project("P114","SecSw",3);
		Project p5=new Project("P115","InsSw",4);
		Project p6=new Project("P116","ERP",8);
		
	//	dao.insertProjects(p1); dao.insertProjects(p2); dao.insertProjects(p3);
	//	dao.insertProjects(p4); dao.insertProjects(p5); dao.insertProjects(p6);
		
		
		Employee e1=new Employee("E111","AAA",55000);
		e1.setEid("E111"); e1.setEname("AAA"); e1.setSalary(55000);
		e1.getProjects().add(new Project("P111"));
		e1.getProjects().add(new Project("P113"));   e1.setLap(new Laptop("L112"));
		e1.getProjects().add(new Project("P115"));
		
		Employee e2=new Employee();
		e2.setEid("E112"); e2.setEname("BBB"); e2.setSalary(78000);
		e2.getProjects().add(new Project("P112")); 
		e2.getProjects().add(new Project("P113"));   e1.setLap(new Laptop("L111"));
		e2.getProjects().add(new Project("P114"));
		
	//	dao.insertEmployees(e1); dao.insertEmployees(e2);
		
		
		
		
		Laptop l1=new Laptop("L111","Dell",40000,new Employee("E111")); 
		Laptop l2=new Laptop("L112","Hcl",50000,new Employee("E112")); 
		

	//	dao.insertLaptops(l1); 		dao.insertLaptops(l2); 
		
		
		Vehicle v1=new Vehicle("Reg1", "Brand1", "Model1", 89000, new Employee("E111"));
		Vehicle v2=new Vehicle("Reg2", "Brand2", "Model2", 79000, new Employee("E112"));
		Vehicle v3=new Vehicle("Reg3", "Brand3", "Model3", 69000, new Employee("E111"));
		Vehicle v4=new Vehicle("Reg4", "Brand4", "Model4", 55000, new Employee("E112"));
		Vehicle v5=new Vehicle("Reg5", "Brand5", "Model5", 75000, new Employee("E111"));
		
		dao.insertVehicles(v1);  dao.insertVehicles(v2); dao.insertVehicles(v3);
		dao.insertVehicles(v4);  dao.insertVehicles(v5);
		
	}

}
