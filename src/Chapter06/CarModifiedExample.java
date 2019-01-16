package Chapter06;

public class CarModifiedExample {
    public static void main(String[] args) {
        CarModified car1 = new CarModified();
        System.out.println("car1.company : " + car1.company);
        System.out.println();

        CarModified car2 = new CarModified("자가용");
        System.out.println("car2.company : " + car2.company);
        System.out.println("car2.model : " + car2.model);
        System.out.println();

        CarModified car3 = new CarModified("자가용", "빨강");
        System.out.println("car3.company : " + car3.company);
        System.out.println("car3.model : " + car3.model);
        System.out.println("car3.color : " + car3.color);
        System.out.println();

        CarModified car4 = new CarModified("택시", "검정", 200);
        System.out.println("car4.company : " + car4.company);
        System.out.println("car4.model : " + car4.model);
        System.out.println("car4.color : " + car4.color);
        System.out.println("car4.maxSpeed : " + car4.maxSpeed);
    }
}
