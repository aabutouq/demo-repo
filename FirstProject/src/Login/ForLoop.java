package Login;

public class ForLoop {

	public static void main(String[] args) {
		ForLoop Obj = new ForLoop(5);
	}

 public ForLoop (int x) {
	
	 int ifvariable = x;
	
	for (int n=0; n<ifvariable; n++) {
		for (int m=1; m<=ifvariable; m++) {
			
		if (ifvariable-m<= n) {
			
			System.out.print("*");
			
			}
		else {
			System.out.print(" ");	
		}	
		
	}
		System.out.println();
			
	}

}

 
 


}


