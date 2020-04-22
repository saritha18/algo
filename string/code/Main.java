package com.string.code;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main{
	public static void main(String[] args) {
		System.out.println(convertible("abca", "dced"));
		System.out.println(convertible("ab", "ba"));
		System.out.println(convertible("abcdefghijklmnopqrstuvwxyz", "bcdefghijklmnopqrstuvwxyza"));
		System.out.println(convertible("aa", "cd"));
		System.out.println(convertible("ab", "aa"));
		System.out.println(convertible("abcdefghijklmnopqrstuvwxyz", "bbcdefghijklmnopqrstuvwxyz"));
	}
	private static boolean convertible(String a, String b){
	    int n1 = a.length();
	    int n2 = b.length();
	    if(n1 != n2)
	        return false;
	    Map map = new HashMap();
	    Set valuesSet = new HashSet();
	    for(int i = 0; i < n1; i++){
	        char cha = a.charAt(i);
	        char chb = b.charAt(i);
	        if(!map.containsKey(cha)){
	            map.put(cha, chb);
	            valuesSet.add(chb);
	        }
	        else{
	        	char c= (Character)map.get(cha);
	            if(c != chb)
	                return false;
	        }
	    }
	    return map.size() == 26 && valuesSet.size() == 26 ? false : true;
	}
}