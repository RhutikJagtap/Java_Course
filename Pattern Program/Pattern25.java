class Pattern25 
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
				System.out.print((char)(74-column)+" ");
			}
			System.out.println();
		}
		
	}
}
/*
                  J
                J I
              J I H
            J I H G
          J I H G F
        J I H G F E
      J I H G F E D
    J I H G F E D C
  J I H G F E D C B
J I H G F E D C B A

*/