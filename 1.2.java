public static void main(String[] args) {
   	 xMethod(1234567);
}

public static void xMethod(int n) {
   	 while (n > 0) {
   		 System.out.print(n % 10);
   		n/=10;
   	 }
 }
