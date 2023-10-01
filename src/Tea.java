import java.util.*;

public class Tea {

    String teaIngredient1;
    String teaIngredient2;
    String teaIngredient3;
    String teaIngredient4;


    void addTeaDetails(String ingredients1, String ingredients2, String ingredients3,String ingredients4 ) {
        teaIngredient1 = ingredients1;
        teaIngredient2 = ingredients2;
        teaIngredient3 = ingredients3;
        teaIngredient4 = ingredients4;

    }

    void showTeaDetails() {
        System.out.println("Preparing with: " + teaIngredient1+", " + teaIngredient2 + ", " +teaIngredient3 + "," +teaIngredient4 );
        System.out.println(teaIngredient4 + "spoon sugar added");

    }

    public static void main(String args[]) {

        Tea milk = new Tea();
        Tea raw = new Tea();
        Tea warmWater = new Tea();



        Scanner sc = new Scanner(System.in);
        int variable;
        int sugar;

        System.out.println("Which tea would you like to prefer?"+ "\n"+ "1: Milk"+"\n"+ "2: Raw"+"\n"+ "Press any key for Warm water");

        variable = sc.nextInt();

        System.out.println("How many spoon of sugar");
        sugar = sc.nextInt();

        milk.addTeaDetails("Milk","liquor", "Warm water", String.valueOf(sugar));
        raw.addTeaDetails("liquor", "Warm water", String.valueOf(sugar), "");
        warmWater.addTeaDetails("Warm water", "", "","");

        switch (variable) {
            case 1:
                milk.showTeaDetails();
                break;
            case 2:
                raw.showTeaDetails();
                break;
            default:
                warmWater.showTeaDetails();
        }

    }
}