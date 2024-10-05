public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Sellers sellers = new Sellers();
        Sellers.setName("Karel Novák");
        System.out.println(sellers.getName());
        Sellers.setAddress("Bramborákov 11");
        System.out.println(sellers.getAddress());
        Sellers.setName("Bořivoj Horák");
        System.out.println(sellers.getName());
        Sellers.setAddress("Řízkov 24/16");
        System.out.println(sellers.getAddress());

    }
}