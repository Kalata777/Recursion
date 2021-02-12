public static void main(String[] args) {
	   	 xMethod(3,1);
	}

	public static int xMethod(int n, int m) {
		if(n>0) {
			m*=2;
			return xMethod(n-1,m);
		}else {
			return m;
			
		}

	 }

}
