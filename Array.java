public class Array {
    public static void main(String[] args){
		int arr[][] = {{2,3,4},{5,6,7}};

		System.out.println("Total number of rows: " + arr.length);
		System.out.println("columns in the first row: " + arr[0].length);
		System.out.println("\nLooping through a Multidimensional array");

		for(int row=0; row < arr.length; row++){
			System.out.println("...printing the " + (row + 1) + " row...");
			for(int col=0; col < arr[row].length; col++){
				System.out.print(arr[row][col] + " " );

				if(col == (arr[row].length - 1)){
					System.out.println();
				}
			} 
		}
	}
}
