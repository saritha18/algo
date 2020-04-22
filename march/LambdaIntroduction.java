package com.march;

import java.util.Arrays;

public class LambdaIntroduction {
	 
	  public static void main (String[] ar){
	          Employee[] employees  = {
	              new Employee("David"),
	              new Employee("Naveen"),
	              new Employee("Alex"),
	              new Employee("Richard")};
	          
	          System.out.println("Before Sorting Names: "+Arrays.toString(employees));
	          Arrays.sort(employees, Employee::nameCompare);
	          System.out.println("After Sorting Names "+Arrays.toString(employees));
	      }
	}
	  
	class Employee {
	  String name;
	  
	  Employee(String name) {
	    this.name = name;
	  }
	  
	  public static int nameCompare(Employee a1, Employee a2) {
	    return a1.name.compareTo(a2.name);
	  }
	    
	  public String toString() {
	    return name;
	  }
	}
	 
