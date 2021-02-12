

	public static void main(String[] args) {
	   	 System.out.println(xMethod(3,4));
	}

	public static int xMethod(int n,int x) {
	int m=1;
		for(int i=0;i<n;i++) {
			m*=x;
		}
		return m;
