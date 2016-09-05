package test.interface_second;

public class Type_Casting__and__instanceof______IMPORTANT____ {

	 /* 부모 타입으로 선언하여 관리할 수 있는 인터페이스의 편리함이 있지만
	     만약 인터페이스 타입으로 구현체 만들어지면 
	     구현체가 스스로 만들어낸 메소드를 구현 할 수가 없다
	     상속의 부모 타입으로 선언 하여 자식객체를 생성하여도 같은 원리
	     
	  이러한 문제?!점을 타개 하기위해서 부모타입으로 선언하여 자유로운 구현체 목록을 넘나들면서 
	    
	  추상체 인터페이스에 제시한 조건 이상의 각 각의 구현체만의 메소드들을 사용하고자 한다면 강제 캐스팅이 필요하다 */

	
	public static void main (String[] args)
	{
		Factory v = new VheicleFac();
        v.run();		
		 /*v의 실체는 구현체 VheicleFac이지만 
		  * 객체의 타입은 부모가 되는 interface type 이기에 
		  * interface에서 제시한 method 목록에 없다면 
		  * 구현체에 담겨 있어도 이용 할 수가 없다*/
        
        /* 이럴때 바로 선언은 자유롭게 넘나들수 있는 조건과 함께~ 
         * 각 구현체의 개성(인터페이스에는 없지만 구현체가 따로 만든 메소드)
         * 들을 접근 사용하기위해    ** 강제 CASTING** 을 해서 자유도를 높인다!!!*/
        
        /*                                   Casting    
            구현체TYPE      새롭게 변모한 변수           구현체TYPE   타겟변수명*/
        VheicleFac from_v_to_real_vheicle =(VheicleFac)    v;
        
      /*이제 새롭게 변신한 강제캐스팅 된 v는 구현체의 고유 메소드를 이용하게 되었다.*/
        from_v_to_real_vheicle.ability();
        
  /*************BUTTTTT!!!!! 하지만 강제 타입변환에서 중요한 점 !!!!  instanceof 를 통해 확인 해야 함!!! 
                             ClassCasting Exception 발생 가능성이 열림@@@@!!!*/
	
 /********************************************CASTING EXCEPTION********************************************/
      /* 구현체 VhecleFac 로 생성하고 ~ 
       * interface 추상체 명세에 없는 VhecleFac 만의 메소드 ability() 메소드를 이용하려고 한다
              강제케스팅 시도 ~~~ 
              그런데 캐스팅을 다른 구현체인 잘못해서 FoodFac로 캐스팅 시도!! 
             
         ClassCastingException !!!
         
         그러니까 결론적으로 구현체 로 강제 케스팅 할 때는 그 놈 녀석의 명확한 타입으로 해 줘야 한다는 말
         그리고 많은 구현체가 있다면 명확하게 모르니까 어떤구현체 객체가 될지 모르니까~
         그런 상황에 쓴다잉  
          */
        
//  요렇게 바로하면 ~~~ 익셉션 발생 -->  FoodFac v_to_FoodFac = (FoodFac) v;    
//                                        v_to_FoodFac.ability();
	
   /*
    * 그래서 instanceof 를 이용해서 안전장치를 걸라 NULL 체크 처럼 말이다~*/
        System.out.println("**************  Vheicle의 구현체 메소드사용을 위해 instanceof 를 통해 구현체 타입을 확인하여 출력 시작 *************");
      if( v instanceof FoodFac)
      {
    	  FoodFac v_to_foodFac    = (FoodFac) v ;
    	  v_to_foodFac.ability();
         
      }
      else if(v instanceof VheicleFac)
      {
    	  VheicleFac v_to_Vheicle = (VheicleFac) v ;
    	  v_to_Vheicle.ability();
      }
      System.out.println("**************  Vheicle의 구현체 메소드사용을 위해  instanceof 를 통해 구현체 타입을 확인하여 출력 완료 *************");    
	/*****************************************CASTING EXCEPTION********************************************/
	
	}	
}


 interface Factory{
	 
	 public void run();
	 
 }
 
 
 class VheicleFac implements Factory{
	 
	 @Override
	public void run() {
		// TODO Auto-generated method stub
	   System.out.println("자동차를 만드는 공장 입니다.");	
	}
	 
	 public void ability(){
		 
		 System.out.println("자동차 생산성 높음");
	 }
 }
 
 
 class FoodFac implements Factory{
	 
	 @Override
	public void run() {
		// TODO Auto-generated method stub
	   System.out.println("음식을 만드는 공장 입니다.");	
	}
	 
	public void ability(){
		
		System.out.println("음식 생산성 보통");
	}
 }
 
 
 