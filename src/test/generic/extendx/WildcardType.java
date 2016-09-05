package test.generic.extendx;

import java.util.Arrays;

/*--************ 학원 수강현황 보기 ****************--*/

/*===================================== 학생 entity  ===========================================================*/

/*  
 * 
 *  
 * 분류의 최상위 공통점 및 일반화 한 구성단위 
 
 * 학원에 등록할 수 있는 생물체 , 
 * 
 * 학원 목적에 부합하는 수입원 개체의 명제 
 * 
 * =>> 사람 , 인간 , 일반인  ,직장인 주부 기타 등등 
 *  인간의 조건 및 학원에 돈을 지불 할 수 있는 사람 은 일반인  
 */


/* 일반인*/
class Person{

	protected String personType;
	
	public Person(String personType) {
		this.personType = personType;
	}

	public String getPersonType() {
		return personType;
	}

	public void setPersonType(String personType) {
		this.personType = personType;
	}
	
}
 /*  
 * 대분류  =  대분류는 일반인과 학생으로 나눴음 
 * 소분류  =  학생의 위계에 따라서 대학생 , 고등학생 ... 
 * */

/*  (대) 직장이 < = 성인 && 학생이아닌 일반인 */
class Worker extends Person{

	public Worker(String personType) {
		super(personType);
		// TODO Auto-generated constructor stub
	}
}
/*  (대) 학생  < = 미성년자 || 직장이 없는 일반인 대학생 */
class Student extends Person{

	public Student(String personType) {
		super(personType);
		// TODO Auto-generated constructor stub
	}
}
	 /*(소1) 고등학생*/
	 class HighStudent extends Student{

		public HighStudent(String personType) {
			super(personType);
			// TODO Auto-generated constructor stub
		}
	 }
/*=================================== 강좌 entity  =============================================================*/
	 /*  generic type  매개값이나 parameter  or  리턴 타입으로 사용 할 떄 
	  *  구체적인 타입 대신에 와일드 카드를 통해서 제한 된 파라미터 제네릭을 가질 수 있다. 
	  * 
	  * 
	  * -  wildCard <?> -  
	  * -  GenericType  - 
	  *  
	  *   제한 없음 */

	 /* 
	  * 학원 강좌 개설. 
	     강좌 이름,  정원, 학생 분류 기준
	     여기는 정의 하는 클래스 이다 
	 */
	 class  Course<T> 
	 {
	 	
	 	private String course_name;
	 	private T[] students;
	 
	 /*강좌명 및 수용 인원*/
	 	@SuppressWarnings("unchecked")
	 	public Course(String course_name , int capacity)
	 	{
	 		this.course_name = course_name;
	 	           /*  T , type parameter로 배열을 생성 하려면 
	 	            *  T[n] 으로 생성 할 수 없고
	 	            * (T[]) (new Object[n]) 으로 생성 해야한다. */
	 		students =(T[])(new Object[capacity]);
	 	}

	 	public  String  getCourseName(){ return  course_name; }
	 	public  T[]     getStudentes (){ return  students;    }
	 	
	  /* 학생 등록  */
	 		public void add(T t)
	 		{
	 			for(int a = 0 ; a <students.length ; a++)
	 			{
	 				if(students[a]==null)
	 				{
	 					students[a] = t ;
	 					break;
	 				}
	 			}
	 		}
	 }	 
	 

/*<<< 강좌 및 수강생 정보 가져오기 >>> 
 *
 *  1. 전체 수강생 데이터 가져오기 
 *  2. 대분류 기준으로  ( 일반인, 학생 )
 *  
 *  */
public class WildcardType {


	public static void registCourse(Course<?>course)
	{
		System.out.println(course.getCourseName()+" 수강생"+Arrays.toString(course.getStudentes()));
	}
	
	public static void registCourseStudent(Course<? extends Student> course)
	{
		System.out.println(course.getCourseName()+" 수강생"+Arrays.toString(course.getStudentes()));
	}
	
	public static void registCourseWorker(Course<? super Worker> course)
	{
		System.out.println(course.getCourseName()+" 수강생"+Arrays.toString(course.getStudentes()));
	}

	
	
	public static void main(String[]args)
	{
    /* 강좌 개설 */ 
		Course<Person> personCourse  =  new Course<Person>("일반인 과정",5);
		           
		    /*수강생 등록                           학생 타입 입력 (신상 명세는 각 학생의 entity 내부에 가지고 있다)  */   
		               personCourse.add(new Person("일반인"));
		               personCourse.add(new Worker("직장인"));
		               personCourse.add(new Student("학생"));
		               personCourse.add(new HighStudent("고등학생"));
	
		               
		Course<Worker> workerCourse  =  new Course<Worker>("직장인",5);  
		               workerCourse.add(new Worker("직장인"));
		               
       Course<Student> studentCourse  	 =  new Course<Student>("학생",5);	               
		               studentCourse.add(new Student("학생"));
	                   studentCourse.add(new HighStudent("고등학생"));
	
   Course<HighStudent> highStudentCourse =  new Course<HighStudent>("고등학생", 5);
	                   highStudentCourse.add(new HighStudent("고등학생"));
	
	                   
	      registCourse(personCourse);             
	                   
	      registCourse(workerCourse);
	      
	      registCourse(studentCourse);
	      
	      registCourse(highStudentCourse);
	      
	      
	}
	
}




