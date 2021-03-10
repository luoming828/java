
public class SolveEquation {
	double a,b,c;
	public SolveEquation (double x, double y, double z)
	{
		a=x;
		b=y;
		c=z;
	}

	public void Solve()
	{
		double d=b*b-4*a*c;
		if(d<0)
			System.out.println("此方程无解");
		else 
		{
			double x1=(-b - Math.sqrt(d)) / 2*a;
			double x2=(-b + Math.sqrt(d)) / 2*a;
			System.out.println("此方程的解为：" +"\n" + "x1=" + x1 +"\n" +"x2=" + x2);
			
		}
	}
}
