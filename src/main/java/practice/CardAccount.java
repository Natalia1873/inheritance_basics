package practice;

public class CardAccount extends BankAccount {
    @Override
    public void take(double amountToTake){
        double amountWithComission = amountToTake * 1.01;
        if(amountToTake > 0 && amount >= amountWithComission){
            amount -= amountWithComission;
        }
    }
    // не забывайте, обращаться к методам и конструкторам родителя
    // необходимо используя super, например, super.put(10D);
}
