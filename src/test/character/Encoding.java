package test.character;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.Normalizer;


public class Encoding {

	public Encoding() {
		// TODO Auto-generated constructor stub
	}
	/*  test 2 from naver http://d2.naver.com/helloworld/76650 */
	
	private void printIt(String str)
	  {
		 System.out.println(str);
		 for(int a = 0 ; a < str.length(); a++)
		 {
			 System.out.print(String.format("U+%04x",str.codePointAt(a))+"\t");
		 }
		 System.out.println();
	  }
	 
    public void test()
    {
       String han = "한";
        printIt(han);
        
        String nfd = Normalizer.normalize(han, Normalizer.Form.NFD);
        printIt(nfd);
        
        String nfc = Normalizer.normalize(nfd,Normalizer.Form.NFC);
        printIt(nfc);
       
    }
	
    public void usingGetBytes_for_encodingValue()
    {
    	String str = "한글";
    	byte[] bytes =str.getBytes();
    	for(byte e : bytes)
    	{
    		System.out.print(String.format("0x%02x", e)+"\t");
    	}
      System.out.println();    	
    }
    
    
    
    
	/*encoding Test 1*/
	public void strTest_encoding() throws UnsupportedEncodingException
	{
		
		  String han ="이재혁 입니다. 하하하핳";
		  String[] encoding = new String[]{"EUC-KR","UTF-8","ISO8859-1"};
		  
		for(String e : encoding)
		{
			System.out.println("-----------------------------------");
			System.out.print(e+"_Encode>>>");
			String encoded =URLEncoder.encode(han,e);
			System.out.println(encoded);
			String decoded =URLDecoder.decode(encoded, e);
			System.out.print(e+"_Decode>>>");
			System.out.println(decoded);
			System.out.println("-----------------------------------");
			System.out.println();
		}
		  System.out.println(han.length());
	 }
	  
		
  public static void main(String[]args) throws UnsupportedEncodingException
  {
  
     Encoding e = new Encoding();
  
    /* Java에서 문자열은 항상 UTF-16 BE 인코딩으로 저장되며,
     file.encoding시스템 프로퍼티에 의해 인코딩 값이 결정된다*/
/*
 * java는 String 객체 내부(메모리 상에서) UTF-16 BE 인코딩으로 문자열을 저장하고, 
 * 문자열을 입/출력할 때에만 사용자가 지정한 인코딩 값 또는 운영체제의 기본 인코딩 값으로 문자열을 인코딩한다. 
 * JVM 기본 인코딩은 JVM 로딩 시에만 초기화되므로, 코드 중간에서 file.encoding 프로퍼티를 바꾸는 것은 아무 의미가 없다. 
 * 만약 file.encoding이 지정되어 있지 않다면, OS 환경 변수(예: LANG) 값을 따른다. 
 * Java에서 글자를 깨뜨리지 않으려면, 문자 집합의 이름을 지정해야 한다. 
 * 예를 들어, 문자열 객체의 getBytes() 메서드를 이용하여 바이트 배열을 얻고자 할 때, 
 * getBytes() 대신 getBytes(String charsetName) 메서드를 사용하고, 
 * 반대로 바이트 배열에서 문자열 객체를 얻고자 할 때, new String(byte[] b)
 * 대신 new String(byte[]bs, String charsetName) 메서드를 사용한다.
 */
     
     
     e.usingGetBytes_for_encodingValue();
 
  
  }

}