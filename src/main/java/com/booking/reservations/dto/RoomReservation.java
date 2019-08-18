package com.booking.reservations.dto;

import com.booking.client.dto.Client;
import com.booking.hotel.room.management.dto.Room;


import java.time.LocalDateTime;

public class RoomReservation {

    private final Room room;

    private final LocalDateTime startDate;

    private final LocalDateTime endDate;

    private final Client client;

    private final int numberOfPeople;

    private final double totalPrice;

    public RoomReservation(Client client, Room room, int numberOfPeople, LocalDateTime startDate, LocalDateTime endDate, double totalPrice) {
        this.client = client;
        this.room = room;
        this.numberOfPeople = numberOfPeople;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalPrice = totalPrice;
    }
}
