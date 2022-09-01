
public class Main {

    public static void main(String[] args) {
        PaymentCard petesCard = new PaymentCard(10);
        
        System.out.println("Money: " + petesCard.balance());
        boolean wasSuccessful = petesCard.takeMoney(8);
        System.out.println("Successfully withdrew: " + wasSuccessful);
        System.out.println("Money: " + petesCard.balance());
        
        wasSuccessful = petesCard.takeMoney(4);
        System.out.println("Successfully withdrew: " + wasSuccessful);
        System.out.println("Money: " + petesCard.balance());
        
        // Part 2
        System.out.println("");
        
        PaymentTerminal unicafeExactum = new PaymentTerminal();
        
        double change = unicafeExactum.eatAffordably(10);
        System.out.println("Remaining change: " + change);
        
        change = unicafeExactum.eatAffordably(5);
        System.out.println("Remaining change: " + change);
        
        change = unicafeExactum.eatAffordably(4.3);
        System.out.println("Remaining change: " + change);
        
        System.out.println(unicafeExactum);
        
        
        // Part 3
        System.out.println("");
        
        PaymentCard carlosCard = new PaymentCard(7);
        
        boolean wasBemSucedido = unicafeExactum.eatHeartily(carlosCard);
        System.out.println("There was enough money: " + wasBemSucedido);
        wasBemSucedido = unicafeExactum.eatHeartily(carlosCard);
        System.out.println("There was enough money: " + wasBemSucedido);
        wasBemSucedido = unicafeExactum.eatAffordably(carlosCard);
        System.out.println("There was enough money: " + wasBemSucedido);
        
        System.out.println(unicafeExactum);
    }
}

