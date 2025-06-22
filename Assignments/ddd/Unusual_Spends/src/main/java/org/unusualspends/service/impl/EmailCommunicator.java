package org.unusualspends.service.impl;

import org.unusualspends.service.Communicator;

public class EmailCommunicator  implements Communicator {
    @Override
    public boolean communicate(String recipientContact, String subject, String message) {
        try{
            String[] name=recipientContact.split(" ");
            String firstName=name[0];
            System.out.println("\nTo: "+firstName);
            System.out.println("\nSubject: "+subject);
            System.out.println("\nMessage: \n");
            System.out.println(message+"\n");
            System.out.println("Sent\n");
            return true;
        }catch (Exception ex){
            System.out.println("Exception caught: "+ ex.getMessage());
            ex.fillInStackTrace();
            return false;
        }
    }
}
