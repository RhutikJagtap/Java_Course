class  Pattern20
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
				System.out.print(column+" ");
			}
			System.out.println();
		}
	}
}
/*
                    0
                  0 1
                0 1 2
              0 1 2 3
            0 1 2 3 4
          0 1 2 3 4 5
        0 1 2 3 4 5 6
      0 1 2 3 4 5 6 7
    0 1 2 3 4 5 6 7 8
  0 1 2 3 4 5 6 7 8 9

  */