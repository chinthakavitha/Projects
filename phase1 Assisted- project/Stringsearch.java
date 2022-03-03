package com;
   import java.util.regex.Pattern;
	import java.util.regex.Matcher;
	public class Stringsearch {
	    public static void main(String[] args){

	        String regex = "Harry James Potter (.*?) Mr.Potter";

	        String strToSearch = "Harry James Potter also known as Mr.Potter. Harry James Potter is famous as  Mr. Potter";

	       Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

	        Matcher matcher = pattern.matcher(strToSearch);

	        while (matcher.find()) {

	            System.out.println("Text is at "+matcher.group()+"::"+matcher.start()+"::     "+matcher.end());
	            System.out.println(matcher.groupCount());

	            System.out.println(matcher.group(1));
	        }
	    }

}
