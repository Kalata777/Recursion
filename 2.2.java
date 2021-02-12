	public static void main(String[] args) {
	Kalata(" ",789);
	  
	}
	public static boolean Even(int n) {
		
while(n>0) {
	n-=2;
	
}
if(n==0) {
	return true;
	
}

	return false;

	 }
	public static void Kalata(String k, int n) {
		if(n!=0) {
		if(Even(n)) {
		
			if(k!=" ") {
				k+="0";
			}
			
		}else {
			k+="1";
		}
		Kalata(k,n/2);
	
	
	}else {
	 	 System.out.println(k);
	}
	}
