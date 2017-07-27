package sort;

 
		 /**
		  * 
		  * @author Binalfew
		  *
		  */
		
		public class SortingValues
		{
			public static void main( String[] args )
			{
				int[] arr = { 45, 87, 39, 32, 93, 86, 12, 44, 75, 50 }; //given array 

				// Display the original (unsorted values)
				System.out.print("before: ");
				for ( int i=0; i < arr.length; i++ )
					System.out.print( arr[i] + " " );
				    System.out.println();

				// Swap the values around to put them ascending order.
				 int temp; // create temporary variable that holds the number that being swapped. 
				 
				for (int i=0 ;i < arr.length ;i++ )
				{
					for (int j=0 ; j< arr.length-1; j++)
					{
						if (arr[j] > arr[j+1] ) // if arr[j] >arr[j+1]
						{
						  temp = arr[j] ;  
						  arr[j] =arr[j+1];
						  arr[j+1] =temp;
						}
					}
				
				
				}
				 

				// Display the values again, now (hopefully) sorted.
				System.out.print("after : ");
				for ( int i=0; i< arr.length; i++ )
					System.out.print( arr[i] + " " );
				    System.out.println();
			
		
		 

	} }

