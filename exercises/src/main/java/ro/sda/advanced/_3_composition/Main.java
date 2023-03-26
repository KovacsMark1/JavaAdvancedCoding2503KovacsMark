package ro.sda.advanced._3_composition;


/**
 * composition nu este o propr. OOP
 * Prop. OOP  => inheritance, polymorphism, abstraction, encapsulation
 **/

/*
 *
 * The following exercise is for understanding composition, we will create a few classes which represents different
 * components of a PC.
 */



public class Main {
    public static void main(String[] args) {

        Case case1 = new Case("220B", "HP", "230",
                new Dimension(10, 20, 30));
        Monitor monitor1 = new Monitor("27 inch", "Asus", "27",
                new Resolution(20, 30));

        PC pc1 = new PC(monitor1, case1);


        pc1.powerUp();



        case1.setManufacturer("gigabyte");
        case1.setModel("nush d-astea");

    /*    PC pc2 = new PC(new Case("Model", "Manufacturer", "230",
                new Dimension(30, 40, 50)),
                new Monitor("3x4", "Acer", "32",
                        new Resolution(30, 40)));

        pc2.powerUp();
*/


    }
}
