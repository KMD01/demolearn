package sda;

import java.util.Locale;
import java.util.Scanner;

public class InvitationMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfInvitation = scanner.nextInt();

        Invitation[] invitations = new Invitation[numberOfInvitation];

        for (int i = 0; i <invitations.length ; i++) {

            System.out.println("Input first name:");
            String firstName = scanner.next();
            System.out.println("Input last name:");
            String lastName = scanner.next();
            System.out.println("Input type of invitation:");
            String invitationType = scanner.next();
            InvitationType invitationTypeEnum = InvitationType.valueOf(invitationType.toUpperCase());

            invitations[i] = new Invitation(firstName,lastName,invitationTypeEnum);





        }



    }
}
