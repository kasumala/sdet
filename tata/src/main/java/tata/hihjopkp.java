package tata;

import java.util.HashMap;
import java.util.Map;

public class hihjopkp {

	public static void main(String[] args) {
	  String S = "S a t i s h @@#$%$";
	  int capital =0,small=0,spaces=0,character=0;
	  for(int i=0;i<S.length();i++) {
		  if(S.charAt(i)>='A'&&S.charAt(i)<='Z') {
			  capital++;
		  }
		  else if(S.charAt(i)>='a'&&S.charAt(i)<='z') {
			  small++;
		  }
		  else if(S.charAt(i)==' ' ) {
			  spaces++;
		  }
		  else {
			  character++;
		  }
	  }
	 System.out.println(capital);
	 System.out.println(small);
	 System.out.println(spaces);
	 System.out.println(character);
		
		
		
		
		
		
		
	}

}
