package fizzbuzz;

public class MyFizzBuzz {

	public void darykFizzBuzz(int nuo, int iki) {
		
		for (int i = nuo; i <= iki; i ++) {
			  
			if(i % 15 == 0){
			    System.out.print("fizzbuzz, ");
			  }
			  else if(i % 3 == 0)
				  System.out.print("fizz, ");
			  else if(i % 5 == 0)
				  System.out.print("buzz, ");
			  else {
			  System.out.print(i + ", ");
			  }
			}
		
	}
		
}
