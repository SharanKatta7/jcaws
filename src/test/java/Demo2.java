
public class Demo2 {
	
	public boolean palindromeCheck(String a)
	{
		String str=a.toLowerCase();
		int count=str.length();
		boolean res=true;
		int range=count/2;
		if(count%2==0)
		{
			range=range-1;
		}
		for(int i=0;i<=range;i++)
		{
			if(str.charAt(i)!=str.charAt(count-i-1))
			{
				res=false;
			}
		}
		return res;
	}

}
