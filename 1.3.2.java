public static void main(String[] args) {
	   	 System.out.println(xMethod(3));
	}

	public static int xMethod(int n) {
		int m=1;
		for(int i=0;i<n;i++) {
			m*=2;
		}
		return m;
	}
