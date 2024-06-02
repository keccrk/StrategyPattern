public class BitcoinStrategy implements PaymentStrategy {
    private String bitcoinAdress;

    public BitcoinStrategy(String bitcoinAdress){
        this.bitcoinAdress = bitcoinAdress;
    }

    @Override
    public void pay(int amount){
        System.out.println(amount + " Paid using Bitcoin.");
    }
}
