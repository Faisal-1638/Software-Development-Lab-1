public class maths{
	public static void main(String[] args){
		System.out.println("checking max between 5 and 6 : " + Math.max(5,6));
		System.out.println("checking min between 7 and 2 : " + (Math.min(7,2)));
		System.out.println("2^3 = " + (Math.pow(2,3)));
		System.out.println("square root of 4 is " + (Math.sqrt(4)));
		System.out.println("abs value of -4.7 is " + (Math.abs(-4.7)));
		System.out.println("round of 5.6 is " + (Math.round(5.6)));
		System.out.println("ceil point 5.6 is " + (Math.ceil(5.6)));
		System.out.println("floor point of 5.6 is " + (Math.floor(5.6)));
		
		int randomNum = (int) (Math.random() * 101);

		System.out.println("random number between 0 - 100 : " + randomNum);
	}
}