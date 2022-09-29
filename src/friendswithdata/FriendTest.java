package friendswithdata;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many friends should we put in? ");
        int userAmountInput = in.nextInt();

        ArrayList<Friend> friends = new ArrayList<>(userAmountInput);

        System.out.print("So " + userAmountInput + " friends? ... Please enter you friends data ");
        in.nextLine();

        for (int i = 1; i <= userAmountInput; i++) {
            System.out.println("Put in name, phone and email");
            friends.add(new Friend(in.nextLine(), in.nextLine(), in.nextLine()));
        }

        for (int i = 0; i < userAmountInput ; i++) {
            System.out.println("UserInputs " + " name is: " + friends.get(i).getName() +
                    " phone number is: " + friends.get(i).getPhone() +
                    " and email is: " + friends.get(i).getEmail() );
        }

        System.out.println(friends);
    }
}
