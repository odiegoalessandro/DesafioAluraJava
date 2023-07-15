import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String name;
        String accountType;
        int option = 0;
        double balance;

        System.out.println("Digite seu nome completo: ");
        name = reader.nextLine();
        reader = new Scanner(System.in);

        System.out.println("Digite seu saldo inicial: ");
        balance = reader.nextDouble();
        reader = new Scanner(System.in);

        System.out.println("Digite o tipo da sua conta: ");
        accountType = reader.nextLine();
        reader = new Scanner(System.in);

        User user = new User(name, balance, accountType);
        Account account = new Account(user);

        System.out.printf("""
                ## Dados iniciais ##
                                
                Nome: %s
                Saldo inicial: %f
                Tipo da conta: %s
                                
                ####################
                %n""", user.getName(), user.getBalance(), user.getAccountType());

        while (option != 3){
            System.out.println("""
                    #### Opções ####
                    1 - Transferir
                    2 - Depositar
                    3 - Sair do sistema
                    """);

            option = reader.nextInt();
            reader = new Scanner(System.in);

            switch (option){
                case 1 -> {
                    System.out.println("Para quem você deseja transferir? ");
                    String beneficient = reader.nextLine();
                    reader = new Scanner(System.in);
                    System.out.println("Quanto deseja transferir? ");
                    double value = reader.nextDouble();
                    reader = new Scanner(System.in);

                    if(account.getBalance() >= value){
                        account.transfer(value, beneficient);
                        System.out.println("Transferencia realizada com sucesso");
                        System.out.println("Seu saldo atual " + account.getBalance());
                    } else {
                        System.out.println("Transferencia falhou");
                    }


                }
                case 2 -> {
                    System.out.println("Quanto você deseja depositar? ");
                    double value = reader.nextDouble();
                    account.deposit(value);
                    System.out.println("Sucesso agora seu saldo é " + account.getBalance());
                }
            }
        }

    }
}