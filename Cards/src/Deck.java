import java.util.Random;

public class Deck {

	private int deck[];
	private int ran;
	
	public Deck() 
	{
		deck = new int [13];
		prep();
		fill();
		print();
	}

	private void random()
	{
		Random random = new Random();
		ran = random.nextInt(13);
	}
	
	private void print()
	{
		for(int i = 0; i < 13; i++)
		{
			System.out.print(" " + deck[i]);
		}
	}
	
	private void prep()
	{
		for(int i = 0; i < 13; i++)
		{
			deck[i] = 14;
		}
	}
	
	private void fill()
	{
		for(int i = 1; i < 14; i++)
		{
			random();
			
			if(deck[ran] == 14 && !check(i))
			{
				deck[ran] = i;
			}
			else i--;
		}
	}
	
	private boolean check(int x)
	{
		boolean result = false;
		for(int i = 0; i < 13; i++)
		{
			if(deck[i]==x)
			{
				result = true;
			}
		}
		return result;		
	}
}
