class Pattern24 
{
	public static void main(String[] args) 
	{
		for(int row=0;row<10;row++)
		{
			for(int spaces=0;spaces<=(9-row);spaces++)
			{
				System.out.print(" "+" ");
			}
			for(int column=0;column<=row;column++)
			{
				System.out.print((char)(65+column)+" ");
			}
			System.out.println();
		}
	}
}
/*
                  A 
                A B
              A B C
            A B C D
          A B C D E 
        A B C D E F
      A B C D E F G
    A B C D E F G H
  A B C D E F G H I 
A B C D E F G H I J

*/