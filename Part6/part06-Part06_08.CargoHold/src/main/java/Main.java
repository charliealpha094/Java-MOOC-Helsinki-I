
public class Main {

    public static void main(String[] args) {
        Item book = new Item("The lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);
        
        System.out.println("The book's name: " + book.getName());
        System.out.println("The book's weight: " + book.getWeight());
        
        System.out.println("Book: " + book);
        System.out.println("Phone: " + phone);
        
        // Part 2
        System.out.println();
        
        Suitcase suitcase = new Suitcase(5);
        System.out.println(suitcase);
        
        suitcase.addItem(book);
        System.out.println(suitcase);
        
        suitcase.addItem(phone);
        System.out.println(suitcase);
        
        suitcase.addItem(brick);
        System.out.println(suitcase);
        
        // Part 4
        System.out.println();
        
        System.out.println("The suitcase contains the following items: ");
        suitcase.printItems();
        System.out.println("Total weight: " + suitcase.totalWeight() + " kg");
        
        // Part 5
        System.out.println();
        
        Item heaviest = suitcase.heaviestItem();
        System.out.println("Heaviest item: " + heaviest);
        
        // Part 6
        System.out.println();
        
        Item book2 = new Item("1984", 2);
        Item phone2 = new Item("Samsung Galaxy A42", 1);
        Item brick2 = new Item("brick", 4);
        
        Suitcase adasCase = new Suitcase(10);
        adasCase.addItem(book);
        adasCase.addItem(phone);
        
        Suitcase pekkasCase = new Suitcase(10);
        pekkasCase.addItem(brick);
        
        Hold hold = new Hold(1000);
        hold.addSuitcase(adasCase);
        hold.addSuitcase(pekkasCase);
        
        System.out.println(hold);
        
        // part 7
        System.out.println();
        
        System.out.println("The suitcases in the hold contain the following items:");
        hold.printItems();
    }

}
