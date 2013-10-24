/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package maplab1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author gclark7
 */
public class MapLab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Lab 1
        System.out.println("Lab1");
        Map<String,JetFighter> jets = new HashMap<String,JetFighter>();
        
        JetFighter j1=new JetFighter("Ruthless");
        JetFighter j2=new JetFighter("BloodThirsty");
        JetFighter j3=new JetFighter("JackedUp");
        
        jets.put(j3.getJetID(), j3);
        jets.put(j2.getJetID(), j2);
        jets.put(j1.getJetID(), j1);
        
        System.out.println(jets.get(j1.getJetID()));
        
        //Formal Lab 1 completed 
        
        //Formal Lab 2
        //Non Generic
        System.out.println("Lab2");
        System.out.println("NON-Generics");
        List employees = new ArrayList();
        Employee e1 = new Employee("Doe", "John", "333-33-3333");
        Employee e2 = new Employee("Smith", "Sally", "111-11-1111");
        Employee e4 = new Employee("Smith", "Sally", "222-22-2222");
        Employee e3 = new Employee("Jones","Bob", "444-44-4444");
        
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        
        System.out.println(employees.size());
        Employee e5;
        
        e5=(Employee)employees.get(1);
        System.out.println(e5.toString());
        
        //Lab 3
        //generics
        System.out.println("Lab3");
        System.out.println("Generics");
        List<Employee> employees1 = new ArrayList<Employee>();
        Employee e6 = new Employee("Doe", "John", "333-33-3333");
        Employee e7 = new Employee("Smith", "Sally", "111-11-1111");
        Employee e8 = new Employee("Smith", "Sally", "222-22-2222");
        Employee e9 = new Employee("Jones","Bob", "444-44-4444");
        
        employees1.add(e6);
        employees1.add(e6);//duplicate value
        employees1.add(e8);
        employees1.add(e9);
        System.out.println("First size employees1");
        System.out.println(employees1.size());
        
        for(Employee e:employees1){
            System.out.println(e);
        }
        
        //Lab4 remove duplicates from list
        System.out.println("Lab4");
        System.out.println("HashSet");
        Set<Employee> empSet = new LinkedHashSet<Employee>(employees1);
        
        employees1.clear();
        employees1.addAll(empSet);
        
        System.out.println(employees1.size());
        
        Employee e10=employees1.get(2);
        System.out.println(e10.toString());
        
        //Lab5 HashMap
        System.out.println("Lab5");
        System.out.println("HashMap");
        Map<Employee,String>hashyMap=new HashMap<Employee,String>();
        hashyMap.put(e1,e1.getSsn());
        hashyMap.put(e2,e2.getSsn());
        hashyMap.put(e3,e3.getSsn());
        hashyMap.put(e4,e4.getSsn());
        
        for(Employee e : hashyMap.keySet()){
            System.out.println(e);
        }
        
        
    }//main
}//Class
