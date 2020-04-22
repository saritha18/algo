package com.string.code;

public class LongestPalindrome {

	public static void main(String[] args) {
		String s="sabbabananae";
		//String s="babad";
		LongestPalindrome ls= new LongestPalindrome();
		System.out.print(ls.longestPolindrome(s));
	}

	private  String longestPolindrome(String s) {
		if(s.isEmpty() || s.length() <=1)
		return s;
		else {
			 String longest = s.substring(0, 1);  // a single char itself is a palindrome
			 for (int i = 0; i < s.length(); i++) {
			    String temp = expandAroundCenter(s, i, i);
			    if (temp.length() > longest.length())
			      longest = temp;
			 
			    temp = expandAroundCenter(s, i, i+1);
			    if (temp.length() > longest.length())
			      longest = temp;
			  }
			  return longest;
		}
		
		
		// TODO Auto-generated method stub
		
	}

	private String expandAroundCenter(String s, int begin, int end) {
		System.out.println("\n");
		System.out.println(begin+ "," +end);
		while(begin >= 0 && end <= s.length() - 1 && s.charAt(begin) == s.charAt(end)) {
			begin--;
		    end++;
		    System.out.println("inside"+begin+","+end);
		  }
		  System.out.println("("+(begin+1) +","+end +")"+ "," +s.substring(begin + 1, end));
		  return s.substring(begin + 1, end);
	}
}

/*Time Complexity
 *
 *O(n2)
 */
/* output
sabbabananae

0,0
inside-1,1
(0,1),s


0,1
(1,1),


1,1
inside0,2
(1,2),a


1,2
(2,2),


2,2
inside1,3
(2,3),b


2,3
inside1,4
inside0,5
(1,5),abba


3,3
inside2,4
(3,4),b


3,4
(4,4),


4,4
inside3,5
inside2,6
(3,6),bab


4,5
(5,5),


5,5
inside4,6
inside3,7
(4,7),aba


5,6
(6,6),


6,6
inside5,7
(6,7),a


6,7
(7,7),


7,7
inside6,8
inside5,9
(6,9),ana


7,8
(8,8),


8,8
inside7,9
inside6,10
inside5,11
(6,11),anana


8,9
(9,9),


9,9
inside8,10
inside7,11
(8,11),ana


9,10
(10,10),


10,10
inside9,11
(10,11),a


10,11
(11,11),


11,11
inside10,12
(11,12),e


11,12
(12,12),
anana 
*/