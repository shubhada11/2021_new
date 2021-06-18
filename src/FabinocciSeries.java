
public class FabinocciSeries {

	public static void main (String args[]) {
		//0,1,1,2,3,5,8
		int n= 10;
		int i=0,j=1;
		System.out.println(i);
		System.out.println(j);
		for(int k =2;k<=n;k++) {
			int l = i+j;
			i=j;
			j=l;
			System.out.println(l);
			
			
		}
	}
}
