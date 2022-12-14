public class Main {
    public static void main(String[] args) {
        tree laptop = new tree ();
        tree laptop1 = new tree(1,"красный", "windows10", 16, "HDD", 256 );
        laptop.addToBase(laptop1);
        tree laptop2 = new tree(2,"синий","linux", 32,"SSD",512);
        laptop.addToBase(laptop2);
        tree laptop3 = new tree();
        laptop3.setId(3);
        laptop3.setColor("черный");
        laptop3.setOs("NoOs");
        laptop3.setRam(8);
        laptop3.setDiscType("HDD");
        laptop3.setDiscVolume(1024);
        laptop.addToBase(laptop3);
        laptop.findInBase(laptop.laptopBase);


    }


}