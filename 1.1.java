public static void main(String[] args) {
	   	 System.out.println("Sum is " + xMethod(5));
	}

	public static int xMethod(int n) {
	int i=0;
	while(n!=1) {
		n--;
		i++;
	}
	return n+i;
	  
	}
