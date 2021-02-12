public static void main(String[] args) {
	   	 System.out.println(xMethod(3,1,4));
	}

	public static int xMethod(int n, int m,int k) {
		if(n>0) {
			m*=k;
			return xMethod(n-1,m,k);
		}else {
			return m;
			
		}

	 }

}
