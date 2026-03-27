public class Ifelse {
    public static void main(String[] args){
		String country = "BANGLADESH";

		if(country == "BANGLADESH"){
			System.out.println("user is from Bangladesh");
		} else if(country == "TURKEY"){
			System.out.println("user is from Turkey");
		} else {
			System.out.println("user is from Unknown country");
		}

		int time = 18;

		String message = (time >= 18) ? "Good Evening" : "Good Morning";

		System.out.println(message);	
	}
    
}
