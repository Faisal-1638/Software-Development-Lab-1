public class Operator {
    public static void main(string args[]){
		int a = 10;
		int b = 3;

		System.out.println(a/b);

		double c = 10d;
		double d = 3d;

		System.out.println(c/d);

		int age = 18;

		System.out.println(age >= 18);

		boolean isLoggedin = true;
		boolean isAdmin = false;

		System.out.println("User is a customer " + (isLoggedin && !isAdmin));
		System.out.println("User is a admin " + (isLoggedin && isAdmin));

		int result = (4 + 2) * 2;
		System.out.println(result);
	}
    
}
