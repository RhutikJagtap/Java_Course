class Pattern18 
{
	public static void main(String[] args) 
	{
		for(int row=0;row<10;row++)
		{
			for(int column=0;column<=row;column++)
			{
				System.out.print((char)(74-row)+" ");
			}
			System.out.println();
		}
	}
}
/*
J
I I
H H H
G G G G
F F F F F
E E E E E E
D D D D D D D
C C C C C C C C
B B B B B B B B B
A A A A A A A A A A
*/