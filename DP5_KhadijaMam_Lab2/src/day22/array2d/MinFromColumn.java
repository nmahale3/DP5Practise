package day22.array2d;
/*
 *
 */
public class MinFromColumn {

		public static void ColumnRowMinMax() 
		{
			int arr[][] = { { 2, 7, 1 }, { 9, 5, 8 } };
		
			int i, j, rlen = arr.length;
			int clen = arr[0].length;
			for (i = 0; i < clen; i++) {
				int max = arr[0][i],min = arr[0][i];
				for (j = 0; j < rlen; j++) 
				{
					if(arr[j][i]>max) {
						max = arr[j][i];
					}
					if(arr[j][i]<min) {
						min = arr[j][i];
					}
				}
				System.out.println("max form column "+(i+1)+"="  + max);
				System.out.println("min form column "+(i+1)+"="  + min);
			}
			}
		public static void main(String[] args) 
		{
			
			ColumnRowMinMax();
		}

	}



