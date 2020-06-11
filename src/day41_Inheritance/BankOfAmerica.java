package day41_Inheritance;

public class BankOfAmerica {

    public static void main(String[] args) {

        BankAccount Can = new BankAccount("Can","Muhtar");

        //System.out.println(Can.accountHolder);
        System.out.println(Can.getAccountHolder());

        System.out.println(Can.getBalance());

        Can.checkBalance();
        Can.depositing(120);
        Can.checkBalance();

        Can.withdrawing(40);
        Can.checkBalance();

        System.out.println(Can);

        Can.withdrawing(120);
        System.out.println(Can);

        Can.depositing(15000);
        System.out.println(Can);
        


    }


}
