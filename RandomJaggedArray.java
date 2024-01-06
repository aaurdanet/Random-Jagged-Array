
public class RandomJaggedArray {

	public static void main(String agr[]) {
	int size = 50;
	 
	
	int [][]jagger = new int[size][];
	
	createArrayframe(jagger);
	
	fillRandomRows(jagger);
	
	dislayArray(jagger);
	
	averageNumber(jagger);
	
	sum(jagger);
	
	int arraySum = sum(jagger);
	int averageNum = (int) averageNumber(jagger);
	System.out.println("The sum of all numbers in the array is " + arraySum + " and the average is " + averageNum);
	} // end of main
	//------------------------------------------------------
	
	public static int sum(int[][] jagger) {// Method to calculate sum
	int total = 0;     
		
	 for(int i = 0; i<jagger.length; i++)
	    	for(int j = 0; j < jagger[i].length; j++) 
	               total += jagger[i][j];
	           
	         return total;
	       }// end of sum loop
		

	public static int averageNumber(int[][] jagger) {
		int average = 0;
		int sum = 0;
		int counter = 0;
			
		for(int i = 0; i < jagger.length; i++) {
			for(int j = 0 ; j < jagger[i].length; j++) {
				sum = jagger[i][j] + sum;
				counter++;
				
			}
		average = sum/counter;
		}// end of average loop
		return  average;
		}
		




		public static void createArrayframe (int [][]a){
	
	final int MIN = 1;// random number generator
    final int MAX = 20;
    int rand = 0;
  
		   
		   for(int row = 0 ; row < a.length; row++) {//Comparing and plotting row number in columns 
			   rand = (int)(Math.random() * (MAX - MIN + 1) + MIN);
			   a[row]= new int[rand];
			   a[row][0] = rand;
		   }

} //End of creating colums with random data 
	
   
   
   
	  
	public static void fillRandomRows(int [][]jagger) {
		final int MIN = 1;// random number generator
	    final int MAX = 20;
	  
	    // Below I am now actually putting the numbers into the row of the ARRAY
	
	    for(int i = 0; i<jagger.length; i++)
	    	for(int j = 1; j < jagger[i].length; j++)
	    		jagger[i][j] = (int)(Math.random() * (MAX - MIN + 1) + MIN);
 
	} // end  for loop
	
   // I am going to call a method to output the Jagged Array
  	
	public static void dislayArray(int [][]jagger) {
		
		  System.out.println("Contents of 2D Jagged Array");
	        for (int i = 0; i < jagger.length; i++) {
	            for (int j = 0; j < jagger[i].length; j++)
	                System.out.print(jagger[i][j] + " ");
	            System.out.println();
	        }
	    }

	
	
	

	
	
}// end of the TestClass
