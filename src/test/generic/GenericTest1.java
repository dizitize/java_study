package test.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericTest1 {

	@SuppressWarnings("unchecked")
	public void nonGeneric(){
		
		@SuppressWarnings("rawtypes")
		List list = new ArrayList();
		     
   		     list.add("hello");
		
		String str = (String)list.get(0);
		
		System.out.println(str);
	}
	
	public void generic(){

		List<String> list = new ArrayList<String>(); 
			
		list.add("Hello Generic");
		
		 String str = list.get(0);
		 
		 System.out.println(str);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericTest1 test = new GenericTest1();
		
		/*test.nonGeneric();*/
		test.generic();

	}

}




