public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234", 100);
        Item item2 = new Item("5678", 300);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.pay(new CreditCardStrategy("Kemal Cirik", "4500 3000 2900 5000", "199", "08/29"));

        cart.pay(new PayPalStrategy("kemal@gmail.com", "3377"));

        cart.pay(new BitcoinStrategy("8S2a5erk649jccsmqQ294L"));
    }
}