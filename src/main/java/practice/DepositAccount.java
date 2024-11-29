package practice;

import java.time.LocalDate;

public class DepositAccount extends BankAccount {
    private LocalDate lastIncome;

    public DepositAccount() {
        super();
        this.lastIncome = null;
    }

    @Override
    public void put(double amountToPut){
        if (amountToPut > 0){
            amount += amountToPut;
            lastIncome = LocalDate.now();
        }
    }

    @Override
    public  void take(double amountToTake){
        if (lastIncome == null){
            return;
        }

        LocalDate currentDate = LocalDate.now();
        if(currentDate.isBefore(lastIncome.plusMonths(1))){
            return;
        }

        if (amountToTake >0 && amount >= amountToTake){
            amount -= amountToTake;
        }
    }
}
