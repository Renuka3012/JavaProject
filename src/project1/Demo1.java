package project1;

public class Demo1 {
	
	public Demo1(){
		System.out.println("first default");
	}

	public Demo1(int b,String siva){
	
		System.out.println("Second parameter");
		this.a =b;
		this.name =siva;
	}
	 int a=10;
	 String name="";
	 
	 public static void main(String[] args) {
		
		 Demo1 d1 = new Demo1(23, "sivakumar");
		 System.out.println(d1.a);
		 System.out.println(d1.name);
	}
	
}
