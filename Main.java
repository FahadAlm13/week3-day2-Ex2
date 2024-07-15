//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circle c = new Circle("red",true,1.0);
        Rectangle r = new Rectangle("blue",true,5.0,8.0);
        Square s = new Square("green",false,4.0);

        Rectangle r2 = new Rectangle();

        System.out.println(c);
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println(r);
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println(s);
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println();


        //Here I will do some changing in Circle:
        c.setColor("black");
        c.setRadius(5.0);
        c.setFilled(false);
        System.out.println(c);

        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println();

        //Here I will do some changing in Rectangle:
        r.setColor("red");
        r.setFilled(false);
        r.setWidth(15);
        r.setLength(9);
        System.out.println(r);
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println();

        //Here I will do some changing in Square:
        s.setColor("yellow");
        s.setFilled(true);
        s.setWidth(12);
        System.out.println(s);
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println();

        // r2
        r2.setColor("blue");
        r2.setFilled(true);
        r2.setWidth(4);
        r2.setLength(6);
        System.out.println(r2);
    }
}