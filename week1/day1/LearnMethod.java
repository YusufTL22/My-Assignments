package week1.day1;

public class LearnMethod {
	public void printMyName(){
		System.out.println("Testleaf");
		
	}
	public String getLocation() {
		return "Chennai";
		
	}
	public int addTwonumbers (int a,int b) {
		int c = a+b;
		return c;
	}
	public static void main(String[] args) {
	LearnMethod obj= new LearnMethod ();
	obj.printMyName();
	String output = obj.getLocation();
	System.out.println(output);
	int sum = obj.addTwonumbers(5, 22);
	System.out.println(sum);
}
}
