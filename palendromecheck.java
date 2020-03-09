package String;
import java.util.*;
public class palendromeString {
	
	public void calcPalendrome(String str1)
	{
		Set<String> sn=new HashSet<String>();  //create a set, in java set takes only unique entries
				
		for(int i=0;i<str1.length();i++)
		{
			for(int j=i+1;j<=str1.length();j++)
			{
					if(palenCheck(str1.substring(i,j)))  //call function palencheck by passing substring initial and final vaues
                 sn.add(str1.substring(i,j));  //if it returns true then, add that string to the SET
			}
		}
         for(String a:sn)
         {
        	 System.out.print(a+" ");
        	//if(palenCheck(a))
        		//s2.add(a);
         }
	}
	public boolean palenCheck(String st)
	{
		
		int i=0,j=st.length()-1;
		if(j<1)                                   // if the string is of size 0 or 1, it is ofcource a palendrome
			return true;
		
		while(i<=j)
		{
			if(st.charAt(i)!=st.charAt(j))          //compare the initial and the last element of the string
				return false;
			i++;
			j--;
		}
		return true;
	}
}


package String;

public class mainString {

	public static void main(String[] args) 
  {
	    palendromeString pl=new palendromeString();
	    pl.calcPalendrome("abaaa");
	}

}
