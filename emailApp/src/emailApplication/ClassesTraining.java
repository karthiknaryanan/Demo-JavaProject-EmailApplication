package emailApplication;

 

public class ClassesTraining {

	public static void main(String[] args) {
		/*
		 * AverageNNumbers avg = new AverageNNumbers(); avg.start();
		 * 
		 * 
		 * avg =null;
		 * 
		 * 
		 * 
		 * // Declare required variables double volume; double area;
		 * 
		 * // Promt the user to enter the radius value
		 * System.out.println("Enter the value of Radius"); // create an object to read
		 * the console value and store as radius Scanner in =new Scanner(System.in);
		 * double radius = in.nextDouble();
		 * 
		 * volume = (4*(22.0/7)/3)*Math.pow(radius, 3); area =
		 * (4*(22.0/7))*Math.pow(radius, 2);
		 * 
		 * System.out.println(volume); System.out.println(area);
		 */
		
		/*
		 * String res =""; System.out.println("Enter the String"); Scanner in =new
		 * Scanner(System.in); String s=in.nextLine(); for(int i=1; i<=s.length();i++) {
		 * res += Character.toString((char)(s.charAt(i-1)-1)); }
		 * 
		 * System.out.println(res);
		 * 
		 */
		
		EncryptString es = new EncryptString();
		
		es.encryptString();
		
		System.out.println(es.getEncryptedString());
		
		es = null;
	}

}
