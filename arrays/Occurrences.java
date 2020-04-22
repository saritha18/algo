package com.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Occurrences {
   public static void main(String [] args) {
	   Scanner scan= new Scanner(System.in);
	   List<String> listOfStrings= new ArrayList<>();
	   int n= scan.nextInt();
	   for(int i=0;i<n;i++) {
		   listOfStrings.add(scan.nextLine());
	   }
	   Set<String> uniqueSet = new HashSet<>(listOfStrings);
	   for(String s:uniqueSet) {
		   System.out.println("String " + s + "frequency " + Collections.frequency(listOfStrings, s));
	   }
   }
}
