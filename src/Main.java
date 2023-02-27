import java.util.ArrayList;
import java.util.Scanner;


class CupCake {
    public double price;
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public void type(){
        System.out.println("A basic generic cupcake with vanilla frosting");

    }
}

class RedVelvet extends CupCake {
    @Override
    public void type() {
        System.out.println("A red velvet based cupcake, with cream cheese frosting");
    }
}

class Chocolate extends CupCake {
    @Override
    public void type() {
        System.out.println("A chocolate based cupcake, with chocolate frosting");
    }
}
class Drink {
    public double price;
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void type() {
        System.out.println("A bottle of water");
    }
}
class Soda extends Drink {
    @Override
    public void type() {
        System.out.println("A bottle of soda");
    }
}
class Milk extends Drink {
    @Override
    public void type() {
        System.out.println("A bottle of Milk");
    }
}

public class Main {




    public static void main(String[] args) {

        ArrayList<CupCake> cupcakeMenu = new ArrayList<CupCake>();

        CupCake cupcake = new CupCake();

        RedVelvet redVelvet = new RedVelvet();

        Chocolate chocolate = new Chocolate();

        System.out.println("We are in the middle of creating the cupcake menu. We currently have three " +

                "cupcakes on the menu but we need to decide on pricing.");
        Scanner input = new Scanner(System.in);

        System.out.println("We are deciding on the price of our standard cupcake here is the description:");

        cupcake.type();

        System.out.println("How much would you pay for this cupcake?");

        String priceText = input.nextLine();

        double price = Double.parseDouble(priceText);

        cupcake.setPrice(price);


        System.out.println("We are deciding on the price of our red velvet cupcake here is the description:");

        redVelvet.type();

        System.out.println("How much would you pay for this cupcake?");

       priceText = input.nextLine();

        price = Double.parseDouble(priceText);

        redVelvet.setPrice(price);



        System.out.println("We are deciding on the price of our chocolate cupcake here is the description:");

        chocolate.type();

        System.out.println("How much would you pay for this cupcake?");

        priceText = input.nextLine();

        price = Double.parseDouble(priceText);

        chocolate.setPrice(price);

        cupcakeMenu.add(cupcake);
        cupcakeMenu.add(redVelvet);
        cupcakeMenu.add(chocolate);

        System.out.println(cupcakeMenu);

        ArrayList<Drink> drinkMenu = new ArrayList<Drink>();
        Drink water = new Drink();
        Soda soda = new Soda();
        Milk milk = new Milk();
        System.out.println("We are in the middle of creating the Drink menu. We currently have three " +

                "Drinks on the menu but we need to decide on pricing.");

        System.out.println("We are deciding on the price of our Water here is the description:");

        water.type();

        System.out.println("How much would you pay for this?");

        priceText = input.nextLine();

        price = Double.parseDouble(priceText);

        water.setPrice(price);


        System.out.println("We are deciding on the price of our soda here is the description:");

        soda.type();

        System.out.println("How much would you pay for this?");

        priceText = input.nextLine();

        price = Double.parseDouble(priceText);

        soda.setPrice(price);



        System.out.println("We are deciding on the price of our milk here is the description:");

        milk.type();

        System.out.println("How much would you pay for this?");

        priceText = input.nextLine();

        price = Double.parseDouble(priceText);
        milk.setPrice(price);

        drinkMenu.add(water);
        drinkMenu.add(soda);
        drinkMenu.add(milk);
        new Order(cupcakeMenu, drinkMenu);
    }


}