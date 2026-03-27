public class Break_Continue {
    public static void main(String[] args){
		int[] nums = {3,-2,1,0,7};

		for(int n : nums){
			if(n < 0) {
				continue;
			}

			if(n == 0){
				break;
			}

			System.out.println(n);
		}
	}
    
}
