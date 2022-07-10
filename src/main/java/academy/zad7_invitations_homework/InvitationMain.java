package academy.zad7_invitations_homework;

import java.util.Scanner;

public class InvitationMain {



    public static void main(String[] args) {

        String invitationType;
        InvitationType invitationTypeEnum;

        System.out.println("Input number of invitations:");
        Scanner scanner = new Scanner(System.in);
        int numberOfInvitation = scanner.nextInt();


        Invitation[] invitations = new Invitation[numberOfInvitation];

        for (int i = 0; i <invitations.length ; i++) {

            System.out.println("Input first name:");
            String firstName = scanner.next();
            System.out.println("Input last name:");
            String lastName = scanner.next();


            do {
                System.out.println("Input type of invitation:");
                invitationType = scanner.next();
                invitationTypeEnum = InvitationType.valueOf(invitationType.toUpperCase());
            } while (!invitationType.equals("single") && !invitationType.equals("double")) ;
            invitations[i] = new Invitation(firstName,lastName,invitationTypeEnum);
            }

        int personQuantity=0;
        for (int i = 0; i <numberOfInvitation ; i++) {
            personQuantity+=invitations[i].getInvitationType().getPersonNumber();

        }
        System.out.println("Invited: " + personQuantity + " persons.");

        }


    }

