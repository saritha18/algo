package com.string.code;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
public class FindGoogle {
	
	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        String string = bufferedReader.readLine();
/*	        boolean false_check=false;
	        if(string.length() <= 6){
	            for (int i = 0; i < string.length(); i++){
	            char c = string.charAt(i);        
	            if(i== 0 || i==3 ){ if( c=='G' || c=='g') {} 
	               else {
	            	   System.out.println("False");
	            	   false_check=true;
	                   break;
	                  }}
	            if(i==1 || i==2){
	            	if(c=='O'|| c=='0'|| c=='o') {} 
	                else { false_check=true;
	                System.out.println("False"); break;
	              }}
	            if( i==4){if(c=='l'|| c=='L'|| c=='|') {} else{ false_check=true;
	                System.out.println("False");break;}}
	            if(i==5){if(c=='e'|| c=='E' || c=='3') {}else{ false_check=true;
	                System.out.println("False");break;}}
	         }
	        if(string.length() > 6){
	             for (int i = 0; i < string.length(); i++){
	               char c = string.charAt(i); 
	               if(i==0 && c=='G' || c=='g'){} else { false_check=true;
	                   System.out.println("False"); break;}
	               if( i==1 || i==3 && c=='O'|| c=='0'|| c=='o'){} else {  false_check=true;
	                   if(  i==1 || i==3 && c=='(' || c=='[' || c=='<'){} else  { false_check=true;
	                       System.out.println("False"); break; }
	                   if( i==2||i==4 && c==')'|| c==']'|| c=='>'){}else{ false_check=true;
	                       System.out.println("False"); break;}
	                   
	                   System.out.println("False"); break;}
	               if( i==4 && c=='l'|| c=='L'|| c=='|' ){}else{ System.out.println("False");break;}
	               if( i==5 && c=='e'|| c=='E' || c=='3' ){}else{ System.out.println("False");break;}
	                 
	             }
	            
	        }
	        }
	        if(!false_check){  System.out.println("True"); }
	       */
	   
	    System.out.println(string.matches("[gG][0|o|O][o|0|O][gG][lL][eE3]")); //true
	      
			
	    
	    
	      

	        bufferedReader.close();
	    }
}
	


