import java.util.*;
class Game
{
	public static void main(String args[])
	{
		int randomNumber=(int)(Math.random()*100)+1;
		boolean won=false;
		System.out.println("I have choosen a number between 1 and 100.");
		System.out.println("Try to guess.");
		Scanner s=new Scanner(System.in);
		int i,guess;
		for(i=10;i>0;i--)
		{
		System.out.println("You have "+i+" guess(es) left.choose again:\n");
		guess=s.nextInt();
		if(randomNumber>guess)
		{
		System.out.println("It is greater than "+guess+".\n");
		}
		else if(randomNumber<guess)
		{
		System.out.println("It is smaller than "+guess+".\n");
		}
		else
		{
		won=true;
		break;
		}
		}
		if(won)
		{
		System.out.println("CORRECT.....YOU WIN!!");
		
		}
		else
		{
		System.out.println("GAME OVER......YOU LOSE!!!");
		System.out.println("The number was : "+randomNumber);
		}
	}
}
