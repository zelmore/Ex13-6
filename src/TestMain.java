//Ex13-6
//Zachary Elmore
//10/28/16
//Compare two circle to find the one with the biggest radius

public class TestMain {
	public static void main(String[] args){
		ComparableCircle c1 = new ComparableCircle(1);
		ComparableCircle c2 = new ComparableCircle(2);
		ComparableCircle c3 = (ComparableCircle) GeometricObject.max(c1, c2);
		c1.printCircle();
        c2.printCircle();
        System.out.println("Largest Area = " + c3.getArea());
        c3.printCircle();
	}
}