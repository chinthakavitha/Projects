public class ArrayofString
 {
public static void main(String[] args) 
{
String[] strArray= {"kavi","vinnu","sita"};
		
     boolean x =false;
     int in=0; 
     String s ="kavi";
	 for(int i=0;i<strArray.length;i++) 
{
    if(s.equals(strArray[i])) 
    {
	in =i;x=true;break;
}
   }
	if(x)
	    System.out.println(s+" string is found at index " +in);
		else 
	 System.out.println(s+"string is not found in the array");
   }
}