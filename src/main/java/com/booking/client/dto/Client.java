package com.booking.client.dto;

/*Room client is the person who paid for the room.
* The client is responsible for everything that happens in the room
* And client is to be charged if anything happens*/
public class Client {

    private final String firstName;

    private final String lastName;

    private final String clientEmail;

    public Client(String firstName, String lastName, String clientEmail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.clientEmail = clientEmail;
    }
}

