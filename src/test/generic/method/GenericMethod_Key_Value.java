package test.generic.method;

class Pair<K,V> {
	
	private K key;  private V value;
	
	public Pair() {  }

	protected Pair(K key , V value)
	{  this.key = key;  this.value = value;  }
		
	public void setKey(K key)
	{  this.key = key; }
		
	public K getKey()
	{  return key; }
		
	public void setValue(V value)
	{ this.value= value; }
	
	public V getValue()
	{ return value; }
}

class Util {
	
	public static <K,V> boolean compare(Pair <K,V> p1 , Pair <K ,V> p2)
	{
		boolean keyCompare =p1.getKey().equals(p2.getKey());
		boolean valueCompare =p1.getValue().equals(p2.getValue());

		return keyCompare && valueCompare;
	}
}	
	
public class GenericMethod_Key_Value {

	public static void main(String[]args)
	{
        Pair<Integer,String> p1  = new Pair<>(1,"사과");  		 
	    Pair<Integer,String> p2 = new Pair<Integer,String>(1,"사과");
/* Test 1 */	    
	    boolean result1 = Util.<Integer,String>compare(p1, p2);
	    
		    if(result1)
		    {
		    	System.out.println("Result1 논리적으로 동등한 객체");
		    }
		    else
		    {
		    	System.out.println("Result1 논리적으로 동등하지 않은 객체");
		    }
	  
/* Test 2 */    
		Pair<String , String> p1_1 = new Pair<>("user1","홍길동");     
		Pair<String , String> p2_1 = new Pair<String,String>("user2","홍여사");   
	    
		boolean result2 = Util.compare(p1_1, p2_1);
		
			if(result2)
			{
			    System.out.println("Result2 논리적 동등 객체");
			}
			else 
			{
				 System.out.println("Result2 논리적 동등하지 않은 객체");
			}
	}
}