package test.generic.multi_type_generic;

public class productExample {

	public static void main (String[]args)
	{
		product<Tv, String> product1 = new product<>();
		
		
		product1.setKind(new Tv("삼성"));
		product1.setModel("아티브");
		
		Tv     product1_tv     = product1.getKind();
		String product1_model  = product1.getModel();
		
		System.out.println("내가 생산 한 제품은 "+product1_tv.getModel()+product1_model);
		
	}
}

class Tv {
  
  private String model;

  public Tv() {
	// TODO Auto-generated constructor stub
  }
  
	protected Tv(String model) 
	{
		super();
		this.model = model;
    }

	public String getModel() 
	{
	   return model;
    }

	public void setModel(String model) 
	{
      this.model = model;
	}

}