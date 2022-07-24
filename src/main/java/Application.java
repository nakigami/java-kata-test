import domain.Account;
import domain.Client;
import domain.Operation;
import ports.useCases.DepositAmountUseCase;
import ports.useCases.WithdrawAmountUseCase;
import useCases.DepositAmount;
import useCases.WithdrawAmount;
import utils.StatementPrinter;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Client client = new Client("anas");
        Account account = new Account(200.0, client);
        WithdrawAmountUseCase withdrawAmountUseCase = new WithdrawAmount();
        DepositAmountUseCase depositAmountUseCase = new DepositAmount();

        StatementPrinter.print("Welcome to SG Account Manager");
        StatementPrinter.print("-----------------------------");

        StatementPrinter.print("Your actual balance is : " + account.getBalance().toString() + " €");
        StatementPrinter.print(" ");
        StatementPrinter.print(" ");
        Scanner sc = new Scanner(System.in);
        boolean stopFlag = false;

        while(true) {

            StatementPrinter.print("  1 - Withdraw money");
            StatementPrinter.print("  2 - Deposit money");
            StatementPrinter.print("  3 - List all my operations");
            StatementPrinter.print("  4 - Exit");

            StatementPrinter.print("Enter your desired operation : ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    StatementPrinter.print("Enter the desired amount : ");
                    double desiredAmount = sc.nextDouble();
                    withdrawAmountUseCase.execute(account, desiredAmount);
                    break;

                case 2:
                    StatementPrinter.print("Enter the amount that you will deposit : ");
                    double depositAmount = sc.nextDouble();
                    depositAmountUseCase.execute(account, depositAmount);
                    break;

                case 3:
                    for (Operation op : account.getOperations()) {
                        StatementPrinter.print(op.toString());
                    }
                    break;

                case 4:
                    stopFlag = true;
                    break;

                default:
                    StatementPrinter.print("Please enter a valid number from the list above");
            }

            if (stopFlag) break;
        }


    }
}
