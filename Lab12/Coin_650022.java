package ProFun.Lab12;

public class Coin_650022 {
    public static void main(String[] args) {
        Coin C1 = new Coin();
        System.out.println("The radius is : "+C1.getRadius());
        System.out.println("The color is : "+C1.getColor());
        System.out.printf("The area is : %.2f \n",C1.getArea());
        System.out.printf("The circumference is : %.2f \n",C1.getCircumference());
        System.out.println(C1.toString());
        System.out.println("-------------------------------");
        Coin C2 = new Coin(2.0,"blue");
        C2.setColor("brown", "black");
        System.out.println("The radius is : "+C2.getRadius());
        System.out.println("The color is : "+C2.getColor());
        System.out.printf("The area is : %.2f \n",C2.getArea());
        System.out.printf("The circumference is : %.2f \n",C2.getCircumference());
        System.out.println(C2.toString());
    }
}
class Coin{
    double radius;
    String colorHead;
    String colorTail;

    Coin() {
        radius = 1.0;
        colorHead = "red";
        colorTail = "red";
    }

    Coin(double radius ,String color) {
        this.radius = radius;
        this.colorHead = color;
        this.colorTail = color;
    }
    
    double getRadius() {
        return radius;
    }
    String getColor() {
        return colorHead;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }
    void setColor(String colorHead,String colorTail) {
        this.colorHead = colorHead;
        this.colorTail = colorTail;
    }

    double getArea() {
        return (radius * radius) * Math.PI;
    }

    double getCircumference() {
        return radius * 2 * Math.PI;
    }

    void flip(){
        String temp = colorHead;
        colorHead = colorTail;
        colorTail = temp;
    }

    public String toString() {
        return "Coin[radius = " + radius + " ,color Head = " + colorHead + " ,color Tail = " + colorTail +"]";
    } 
}
