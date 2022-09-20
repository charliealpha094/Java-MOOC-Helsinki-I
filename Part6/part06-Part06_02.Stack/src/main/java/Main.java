
public class Main {

    public static void main(String[] args) {

        Stack s = new Stack();
        
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        s.add("Value");
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        
        String taken = s.take();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        System.out.println(taken);
        
        Stack r = new Stack();
        r.add("1");
        r.add("2");
        r.add("3");
        r.add("4");
        r.add("5");
        
        while(!r.isEmpty()) {
            System.out.println(r.take());
        }

    }
}
