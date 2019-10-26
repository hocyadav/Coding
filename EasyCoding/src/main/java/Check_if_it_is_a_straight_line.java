
public class Check_if_it_is_a_straight_line {
	
	static boolean straightLine(int[][] coordinates){
		//y=mx+c
		int x1 = coordinates[0][0];
		int x2 = coordinates[1][0];
		int y1 = coordinates[0][1];
		int y2 = coordinates[1][1];
		System.out.println("printing x1 x2, y1 y2 : \n"+x1+" "+x2+" \n"+y1+" "+y2);
		//find m
		int m = (y2-y1)/(x2-x1);
		//find c --> c = y-mx
		int c = y1 - m*x1;
		boolean flag = false;
		for(int i=2;i<coordinates.length; i++) {
			//check y = mx +c
			int x = coordinates[i][0];
			int y = coordinates[i][1];
			if(y == m*x + c) {
				flag = true;
			}else {
				flag= false;
				break;
			}
		}
		
		return flag;
	}
	
	
	public static void main(String[] args) {
		
		int[][] coordinates = {
				{1,2},
				{2,3},
				{3,4},
				{4,5},
				{5,6},
				{6,7}
				
		}; 	
		System.out.println("straightLine : "+straightLine(coordinates));
		
	}
}
