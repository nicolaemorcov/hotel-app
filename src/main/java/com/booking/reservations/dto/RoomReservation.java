package com.booking.reservations.dto;

import com.booking.client.dto.RoomClient;
import com.booking.room.dto.Room;

import java.time.LocalDateTime;

public class RoomReservation {

    private final Room room;

    private final LocalDateTime startDate;

    private final LocalDateTime endDate;

    private final RoomClient roomClient;

    private final int numberOfPeople;

    private final double totalPrice;

    public RoomReservation(RoomClient roomClient, Room room, int numberOfPeople, LocalDateTime startDate, LocalDateTime endDate, double totalPrice) {
        this.roomClient = roomClient;
        this.room = room;
        this.numberOfPeople = numberOfPeople;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalPrice = totalPrice;
    }
}
