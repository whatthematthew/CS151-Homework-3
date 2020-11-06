import java.util.*;
public class FilterTester {
	// initialize resulting array
	private static int result[];
	// calculate the size, how? or use arraylist
	private static ArrayList<Integer> integerList=new ArrayList<Integer>();
	// iterate through each element, testing it in Filter f
	
	public static int[] filter(int[] a, Filter<Object> f)
	{
		for(int number : a) { 
			if(f.accept(number)) 
			{
			// means that accept method returns true for this number
			// put this number into resulting array
			integerList.add(number);
			} 	
		}
			//return resulting array, if it was an arraylist -> convert to plain array
		result= new int[integerList.size()];
		for(int i=0; i< integerList.size(); i++)
		{
			result[i]= integerList.get(i);
		}
		return result;
	}
	
	public static String[] filter(String[] a, Filter<Object> f)
	{
		String[] temp= new String[a.length];
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			if(f.accept(a[i]))
			{
				temp[j]=a[i];
				j++;
			}
		}
		String[] result2= new String[j];
		for(int i=0; i<j; i++)
		{
			result2[i]=temp[i];
		}
				return result2;
		
	}
	
	public static void main(String[] args) 
	{
		int[] testNumbers = {1, -2, 3, -5, 6, 9};
		int[] positiveNumbers= filter(testNumbers, new FilterObject());
		for (int n : positiveNumbers) 
		{ System.out.print(n + " "); } System.out.println();
		
		String[] testPhrase = {".........", "h","e", "l", "l", "o", " ", "w", "o", "r", "l", "d", "!", "Spoiler Alert!!!"};
		String[] longStrings= filter(testPhrase, new FilterObject());
		for (int i=0; i<longStrings.length; i++)
		{System.out.print(longStrings[i]+ " ");}
	}
}
