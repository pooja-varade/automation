package arrayprogram;

public class array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []numbers= {1,2,3,4,5,6,7};
		double sum=0;
		double average;
		for(int number:numbers)
		{
			sum=sum+number;
		
			
		}
		int arraylength=numbers.length;
System.out.println(arraylength);
average=sum/arraylength;
System.out.println(average);
System.out.println(sum);
		
	}

}
