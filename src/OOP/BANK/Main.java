// Question: How can two clients with multiple accounts be created and printed?
package OOP.BANK;
//1. Create array of two clients
//2. Client A will have 2 accounts and Client B will have 3 account
//3. Print the info of each client using the toString()

public class Main {
    public static void main(String[] args) {
        Client yaw = new Client(100, "Yaw", "0553117624");
        Client ester = new Client(101, "Ester", "0247381219");

        yaw.addAccount(new Account(7, 1000, 1.5, yaw));
        yaw.addAccount(new Account(8, 3000, 1.5, yaw));
        ester.addAccount(new Account(9, 8600, 0.5, ester));
        ester.addAccount(new Account(2, 12600, 0.5, ester));
        ester.addAccount(new Account(10, 47600, 0.5, ester));

        System.out.println(yaw);
        System.out.println(ester);
    }
}
