package EmployeePayrollSystem;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

class EmployeeFileStore{
    String filePath = "C:\\FLEHANDLING\\Employee.ser";

    public void saveEmployee(Employee e){
    	List<Employee> employees = loadAllEmployee();
    	employees.removeIf(emp -> emp.empId == e.empId);
    	employees.add(e);
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
            oos.writeObject(employees);
            oos.close();
            System.out.println("Employee saved: "+e.empId);
        }
        catch(IOException ex){
            ex.getMessage();
        }
    }
    @SuppressWarnings("unchecked")
	public List<Employee> loadAllEmployee(){
        List<Employee> employees = new ArrayList<>();
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath));
          
            
            return (List<Employee>) in.readObject();
           
        }
        catch(Exception e){
            return new ArrayList<>();
        }
    } 


}
