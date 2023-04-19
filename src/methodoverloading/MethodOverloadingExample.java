package methodoverloading;

public class MethodOverloadingExample {

	    public static void main(String[] args) {
	        MethodOverloadingExample obj = new MethodOverloadingExample();
	        obj.print(5);
	        obj.print("Hello");
	        obj.print(2.5);
	    }

	    public void print(int num) {
	        System.out.println("Integer: " + num);
	    }

	    public void print(String text) {
	        System.out.println("String: " + text);
	    }

	    public void print(double num) {
	        System.out.println("Double: " + num);
	    }
	}


