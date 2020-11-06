
public class FilterObject implements Filter<Object>
{
	@Override
	public boolean accept(Object x) {
		// TODO Auto-generated method stub
		if(x instanceof String)
		{
			return ((String)x).length()>8;
		}
		if(x instanceof Integer)
		{
			return (int)x>0;
		}
		return false;
	}

}