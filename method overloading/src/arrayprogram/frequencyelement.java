package arrayprogram;

public class frequencyelement {

	public static void main(String[] args) {
		int  []arr= {2,1,3,4,5,2,4,6,6};
		for(int i:arr)
		{
			
			System.out.println(i);
		}
		System.out.println("****************88");
		int  []fr=new int[arr.length];
		for(int i:fr)
		{
			
			System.out.println(i);
		}
		int visited=-1;
		int count=1;
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					
				count++;
				fr[i]=visited;
					
				}
				
			}
			if (fr[i]!=visited) {
				fr[i]=count;
				
			}
			
		}
		for(int i=0;i<fr.length;i++) {
			if(fr[i] != visited)  
			
			System.out.println(arr[i]+" "+fr[i]);
		}
	}

}

