class  Pattern26
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
				System.out.print((char)(65+row)+" ");
			}
			System.out.println();
		}
	}
}
/*
                  A
                B B
              C C C
            D D D D
          E E E E E
        F F F F F F
      G G G G G G G
    H H H H H H H H
  I I I I I I I I I
J J J J J J J J J J

*/