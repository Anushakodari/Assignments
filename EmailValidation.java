import java.util.Scanner;

	import java.util.Arrays;
	
public class EmailValidation {

	
	  public static void main(String[] args){

		    String[] strings = {"kodarianusha205@gmail.com" ,"java123@gmail.com","javafsdf@gmail.com","simlpilearn2gmail.com"};
		    try (Scanner sc = new Scanner(System.in)) {
				String ab=sc.next();
				
				System.out.println("enter your eamil id");
				
				String toFind= ab;

				boolean found = Arrays.stream(strings).anyMatch(t -> t.equals(toFind));
				
				    if(found)
				      System.out.println(toFind + "  is  valid email.");
				    else
				      System.out.println(toFind + "  is invalid email.");
			}
			  }
			}