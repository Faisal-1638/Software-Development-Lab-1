public class Switch {
    public static void main(String[] args){
		int day = 6;
		
		switch(day){
			case 1:
				System.out.println("it is saturday");
				break;
			case 2:
				System.out.println("it is sunday");
				break;
			case 3:
				System.out.println("it is monday");
				break;
			case 4:
				System.out.println("it is tuesday");
				break;
			case 5:
				System.out.println("it is wednesday");
				break;
			case 6:
				System.out.println("weekend starts from today, cause it is thursday");
				break;
			case 7:
				System.out.println("it is friday, jummah");
				break;
			default:
				System.out.println("invalid day");
				break;
		}
	}
    
}
