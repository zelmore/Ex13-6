
public class ComparableCircle extends Circle implements Comparable{
	
	ComparableCircle(){}
	
	ComparableCircle(double radius){
		super(radius);
	}
	
	public int compareTo(Object c){
	    if (getRadius() > ((Circle)c).getArea())
	      return 1;
	    else if (getRadius() < ((Circle)c).getArea())
	      return -1;
	    else
	      return 0;
	  }
}
