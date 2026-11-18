public class Main {
    public static void main(String[] args) {
        Barista barista = new Barista(3000, 2);

        Customer customer1 = new Customer("은강",10000, false);
        customer1.order(barista, "아메리카노");

        System.out.println("---");

        Customer customer2 = new Customer("혜지",5000, false);
        customer2.order(barista, "아메리카노");

    }
}