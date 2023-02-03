public class Lab4Task1 {
    public static void main(String[] args) {
        int x,y,z;
        x=10;
        y=15;
        z=20;
        boolean a, b, c, d, e;
        if (!(x > 10)) {
            a = true;
            System.out.println("!(x > 10) is : "+a);
        } else {
            a = false;
            System.out.println(a);
        }
        if (x <= 5 || y < 15) {
            b = true;
            System.out.println("x <= 5 || y < 15 is : "+b);
        } else {
            b = false;
            System.out.println("x <= 5 || y < 15 is : "+b);
        }
        if ((x != 5) && (y != z)) {
            c = true;
            System.out.println("(x != 5) && (y != z) is : "+c);
        } else {
            c = false;
            System.out.println(c);
        }
        if (x >= z || (x + y >= z)) {
            d = true;
            System.out.println("(x >= z || (x + y >= z)) is : "+d);
        } else {
            d = false;
            System.out.println(d);
        }

        if (x <= y-2 && y >= z || z-2 != 20) {
            e=true;
            System.out.println("(x <= y-2 && y >= z || z-2 != 20) is : "+e);
        }
        else{
            e=false;
            System.out.println(e);
        }
    }
}
