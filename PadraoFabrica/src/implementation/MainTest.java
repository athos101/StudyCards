package implementation;

public class MainTest {
	public static void main(String[] args) {
		Polygon triangle = PolygonFactory.createPolygon(3);
		Polygon square = PolygonFactory.createPolygon(4);
		
		System.out.println(triangle.getDescription());
		System.out.println(square.getDescription());
	}
}
