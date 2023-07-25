package ProFun.Lab12;

public class Circle_650022 {
    public static void main(String[] args) {
        Circle C1 = new Circle();
        System.out.println("The radius is : "+C1.getRadius());
        System.out.printf("The area is : %.2f \n",C1.getArea());
        System.out.printf("The circumference is : %.2f \n",C1.getCircumference());
        System.out.println(C1.toString());
        System.out.println("-------------------------------");
        Circle C2 = new Circle(2.0);
        System.out.println("The radius is : "+C2.getRadius());
        System.out.printf("The area is : %.2f \n",C2.getArea());
        System.out.printf("The circumference is : %.2f \n",C2.getCircumference());
        System.out.println(C2.toString());
    }
}
class Circle {
    double radius;
    Circle() {
        /* Q1 */
        radius = 1.0;
    }

    Circle(double radius) {
        /* Q2 */ 
        this.radius = radius;
    }
    
    double /* Q3 */ getRadius() {
        return radius;
    }

    void /* Q4 */ setRadius(double radius) {
        this.radius = radius;
    }

    double getArea() {
        /* Q5 */
        return (radius * radius) * Math.PI;
    }

    double getCircumference() {
        return radius * 2 * Math.PI;
    }

    public String toString() {
        return "Circle[radius = " + radius + "]";
    } 
}
   
