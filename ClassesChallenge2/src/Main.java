public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        BankAccount account = new BankAccount();
//
//        account.setBalance(1000);
//        System.out.println("Balance="+ account.getBalance());
//        account.depositFunds(500.50);
//        System.out.println("After deposit Balance="+ account.getBalance());
//        account.withdrawFunds(500);
//        System.out.println("After withdraw Balance="+ account.getBalance());

        VipCustomer vipCustomer = new VipCustomer("Erik", "erik@mail.com", "120000");

        System.out.println(vipCustomer.getCustomerName());
        System.out.println(vipCustomer.getCreditLimit());
    }
}