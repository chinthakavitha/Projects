package com;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
public class Map {

	public static void main(String[] args) {
		//Map mm =new HashMap();    //it give in orderwise
		Map mm=new LinkedHashMap(); //to get same order as we given
		mm.put(2, "kavi");
		mm.put(1, "rani");
		mm.put("abc","xyz");
		mm.put(3, "sita");
		System.out.println(mm);
		mm.put(1, "gita");
		mm.put(5, "kavi");
		System.out.println(mm);
		if(mm.containsKey(6)) {
			System.out.println("key present");
		}else {
			System.out.println("key not present");
		}
		System.out.println("using key we get the value "+mm.get(1));
		System.out.println("using key we get the value "+mm.get(10));
		
		
		

	}

}
