/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thilini
 */
public class Application {
    
    
    public static void main(String[] args) {
        
        Employee employee1=new Employee(101, "Emp101", "199835410549", "Hazeem", "Col 12.");
        Employee employee2=new Employee(102, "Emp102", "200112502120", "Waseem", "Col 12.");
        
        boolean imp= employee1.equals(employee2);
        System.out.println(imp);
        
        Employee employee3=employee1;
        
      boolean imp1=  employee1.equals(employee3);
        System.out.println(imp1);
        System.out.println(employee1==employee2);
        System.out.println(employee1==employee3);
        
        
    }
    
}
