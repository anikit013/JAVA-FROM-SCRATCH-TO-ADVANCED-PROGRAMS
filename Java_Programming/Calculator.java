class Calculator 
{
	public static void main(String[] args) 
	{
		int num1=10;
		int num2=20;
		int choice=1;
		switch(choice)
		{
			case 1:System.out.println("Sum="+(num1+num2));
			       break;
            case 2:System.out.println("Difference="+(num1-num2));
                   break;
		    case 3:System.out.println("Multiplication="+(num1*num2));
			       break;
		    case 4:System.out.println("Division="+(num1/num2));
			       break;
		    case 5:System.out.println("Modulus="+(num1%num2));
			        break;
		    default:System.out.println("Invalid Choice");
		}

	}
}
