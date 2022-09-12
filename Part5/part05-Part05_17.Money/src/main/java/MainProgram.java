
public class MainProgram {

    public static void main(String[] args) {
        Money a = new Money(10,0);
        Money b = new Money(5,0);
        
        Money c = a.plus(b);
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        a.plus(c);
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        System.out.println("");
        // Part 2
        
        Money a1 = new Money(10, 0);
        Money b1 = new Money(3, 0);
        Money c1 = new Money(5, 0);
        
        System.out.println(a1.lessThan(b1));
        System.out.println(b1.lessThan(c1));
        
        
        System.out.println("");
        // Part 3
        
        Money a2 = new Money(10, 2);
        Money b2 = new Money(3, 50);
        
        Money c2 = a2.minus(b2);
        
        System.out.println(a2);
        System.out.println(b2);
        System.out.println(c2);
        
        c2 = c2.minus(a2);
        
        System.out.println(a2);
        System.out.println(b2);
        System.out.println(c2);
        
    }
}
