
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("File to read: ");
        String fileName = scanner.nextLine();
        RecipeManager recipeManager = new RecipeManager();
        recipeManager.readRecipe(fileName);
        
        while(true) {
            userMenu();
            String userCommand = scanner.nextLine();
            switch(userCommand) {
                case "list":
                    recipeManager.listRecipes();
                    break;
                case "find name":
                    System.out.println("Searched word: ");
                    String nameSearch = scanner.nextLine();
                    recipeManager.findName(nameSearch);
                    break;
                case "find cooking time":
                    System.out.println("Recipes: ");
                    int maxCookingTime = scanner.nextInt();
                    recipeManager.findCookingTime(maxCookingTime);
                    break;
                case "find ingredient":
                    System.out.println("Ingredient: ");
                    String ingredient = scanner.nextLine();
                    recipeManager.findIngredient(ingredient);
                    break;
                case "stop":
                    return;
            }
        }

    }
    
    public static void userMenu() {
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipe by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipe by ingredient");
        System.out.println("");
        System.out.println("Enter command: ");
    }

}
