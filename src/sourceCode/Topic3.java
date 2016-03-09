package sourceCode;

public class Topic3 {
	public void startTest(){
		int[][] matrix = {{1, 2,  8,  9},
						  {2, 4,  9, 12},
						  {4, 7, 10, 13},
						  {6, 8, 11, 15}};
		System.out.println(find(null, 4, 4, 6));
		}
	
	public boolean find(int[][] matrix, int rows, int colums, int number){
		boolean found = false;
		if(matrix == null || rows <=0 || colums <=0){
			System.out.println("输入参数出错！！");
			return false;
		}
		int row = rows - 1;
		int colum = 0;
		while(row >= 0 && colum < colums){
			if(number == matrix[row][colum]){
				found = true;
				break;
			}else if(matrix[row][colum] > number)
				row--;
			else
				colum++;
		}
		return found;
	}
}
