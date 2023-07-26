//Question: Print Min Number and Max Number in Multi Dimentional Array
/*
 *  2 4 5
 *  3 4 7
 *  1 2 9
 *  
 *  This is the array.
 */
public class MinMaxFromMultiDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initialize Multi dimensional array
		int abc[] [] = {{2,4,5},{3,4,7},{1,2,9}};
		int max = abc[0][0]; //We are assuming the 1st element is the maximum
		int min = abc[0][0];
		
		
		for(int i=0; i<3; i++) {   //i = row
			for(int j=0; j<3; j++) {   //j = column
				
				if(abc[i][j] > max){
					max = abc[i][j];
				} else if 
					(abc[i][j]< min){
						min = abc[i][j];
					}
				}
			}
System.out.println(max);
System.out.println(min);
	}

}
