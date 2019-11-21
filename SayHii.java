public class SayHii {
     public static void main(String[] args) {
	     System.out.println("Selow is the funtion of sayhii");
		 sayhii(sum());
	 }
	 
	 public static void sayhii(int sum) {
	     System.out.println("sayhii!"+sum);
	 }
	 public static int sum(){
		     int sum = 0;
			 for(int i=0;i<=100;i++){
				 sum += i;
			 }
			 return sum;
	 }
}