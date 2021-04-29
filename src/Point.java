import java.util.ArrayList;

public class Point<T> 
{
	private T x;
	private T y;
	
	public Point(T x, T y)
	{
		this.x = x;
		this.y = y;
	}
	public T getX()
	{
		return x;
	}
	
	public Point()
	{
	//	this(0, 0);
	}
	
	@Override
	public String toString() 
	{
		return "Point [x=" + x + ", y=" + y + "] " + this.getX().getClass();//.getName();
	}



	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Point<Double> p = new Point<>(1.2,1.0);
		//Point<Integer> p = new Point<>(1, 1);
		System.out.println(p);
		
		Point<Double> dp = new Point<>(1.,2.);
		System.out.println(dp);
		
		Point<String> sp = new Point<>(new String("1.1"), new String("2.0"));
		System.out.println(sp);
		
		ArrayList<Poin	t<Double>> list = new ArrayList<>();
		list.add(p);
		list.add(dp);
		list.add(sp);
		
		for(Object o: list)
		{
			System.out.println(o);
		}
	}

}
