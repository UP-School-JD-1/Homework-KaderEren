package homeworkbolum9.hw3;

public class PointTest {
	public static void main(String[] args) {
		
		// bir point nesnesi;
		Point point = new Point();

		// o point nesnesinin kolonu olan başka bir point nesnesi
		Point point2 = point.clone();

		// point nesnelerinin merkeze uzaklıkları

		System.out.println("point nesnesinin merkeze olan uzakligi : " + point.distanceToCenter());

		System.out.println("point2 nesnesinin merkeze olan uzakligi: " + point2.distanceToCenter());
		System.out.println();

		// iki point nesnesinin birbirlerine olan uzaklığı

		System.out.println("iki point nesnenin birbirine olan uzakligi : "
				+ point.calculateDistance(point2.getX(), point2.getY()));

		// point nesnelerini move methodu ile taşı

		point.move(-1, 2);
		point2.move(5, 9);

		System.out.println("hareket ettirildikten sonraki degerleri");
		// point nesnelerinin merkeze uzaklıkları

		System.out.println(point.coordinates() + " koordinatının  merkeze olan uzakligi : " + point.distanceToCenter());

		System.out.println(point2.coordinates() + " koordinatının merkeze olan uzakligi: " + point2.distanceToCenter());
		System.out.println();

		// iki point nesnesinin birbirlerine olan uzaklığı

		System.out.println("iki point nesnenin birbirine olan uzakligi : "
				+ point.calculateDistance(point2.getX(), point2.getY()));
	}
}