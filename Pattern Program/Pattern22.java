class Pattern22 
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
				System.out.print(row+" ");
			}
			System.out.println();
		}
	}
}
/*
                    0
                  1 1
                2 2 2
              3 3 3 3
            4 4 4 4 4
          5 5 5 5 5 5
        6 6 6 6 6 6 6
      7 7 7 7 7 7 7 7
    8 8 8 8 8 8 8 8 8
  9 9 9 9 9 9 9 9 9 9

  */