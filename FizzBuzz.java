public class FizzBuzz {
    public String fizzBuzz(int number) {
        int num;
        String message;
        if ((number % 3 == 0) && (number % 5 == 0))
		{
			//System.out.println("FizzBuzz");
			message = "FizzBuzz";
			return message;
		}
		else if (number % 3 == 0)
		{
			//System.out.println("Fizz");
			message = "Fizz";
			return message;
		}
		else if (number % 5 == 0)
		{
			//System.out.println("Buzz");
			message = "Buzz";
			return message;
		}
		else
		{
			//System.out.println(number);
			String str = Integer.toString(number);
			return str;
		}
    }
	public static void main(String []args){
        int number = 3;
		FizzBuzz num = new FizzBuzz();
		System.out.println(num.fizzBuzz(number));
     }
}
