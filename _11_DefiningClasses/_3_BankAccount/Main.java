package _11_DefiningClasses._3_BankAccount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, BankAccount> bank = new HashMap<>();

        BiFunction<Integer, Map<Integer, BankAccount>,BankAccount>
                getAccount = (i, m) -> m.get(i);

        String input = scanner.nextLine();

        while (!input.equals("End")){

            String[] tokens = input.split("\\s+");

            String command = tokens[0];

            String output = "";
            if (command.equals("Create")){
                BankAccount account = new BankAccount();
                bank.put(account.getId(),account);
                output = "Account ID" + account.getId()+" created";
            } else if (command.equals("Deposit")) {
                int id = Integer.parseInt(tokens[1]);
                double amount = Double.parseDouble(tokens[2]);
                BankAccount account = getAccount.apply(id,bank);
                if (account == null){
                    output = "Account does not exist";
                }else
                {
                    account.deposit(amount);
                    output = String.format("Deposited %.0f to ID%d",amount, id);
                }
            } else if (command.equals("SetInterest")) {
                double interest = Double.parseDouble(tokens[1]);
                BankAccount.setInterestRate(interest);
            }else {
                int id = Integer.parseInt(tokens[1]);
                int years = Integer.parseInt(tokens[2]);
                BankAccount account = getAccount.apply(id,bank);
                if (account == null){
                    output = "Account does not exist";
                }else
                {
                    double interest = account.getInterest(years);
                    output = String.format("%.2f",interest);
                }
            }

            if (!output.isEmpty())
            {
                System.out.println(output);
            }
            input = scanner.nextLine();
        }
    }
}
