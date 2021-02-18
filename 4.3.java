package paket2;

public class reccc {
static int[] masiv= new int[17000];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =0;i<masiv.length;i++) {
			masiv[i]=i*3 + 4*i;
		}
		System.out.println(summm(masiv,0,0));
	}
	  public static int summm( int[] x,int n,int sum) {
		  sum+=x[n];
		if(n==x.length-1) {
			sum/=x.length;
			return sum;
		}else {
		n++;
			return summm(x,n,sum);
		}
	  }
	
		
		

}
