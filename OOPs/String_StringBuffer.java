class String_StringBuffer{
	public static void main(String[] args)
	{
		//String is Immutable
		String str1=new String("Java By ");
		String str2=str1.concat("Rj ");
		String str3=str2.concat("Tutorial");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

		//StringBuffer is Mutable
		StringBuffer sb1=new StringBuffer("Java By ");
		StringBuffer sb2=sb1.append("Rj ");
		StringBuffer sb3=sb2.append("Tutorial");
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb3);



	}

}