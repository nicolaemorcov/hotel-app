package com.booking.room.dto;

//TODO create a separate spring module, which will be used for only for spring features purpose
public class Room {

    private final RoomIdentifier roomIdentifier;

    private final int roomDoorNumber;

    private final int roomFloor;

    private final int roomSize;

    private final double roomPrice;

    private final String roomDescription;

    private final RoomFacilities roomFacilities;

    //TODO consider creating a new class which will hold the data about room. e.g. doorNumber, roomPrice, for how many people the room is for
    public Room(RoomIdentifier roomIdentifier, int roomDoorNumber, int roomFloor, int roomSize, double roomPrice, String roomDescription, RoomFacilities roomFacilities) {
        this.roomIdentifier = roomIdentifier;
        this.roomDoorNumber = roomDoorNumber;
        this.roomFloor = roomFloor;
        this.roomSize = roomSize;
        this.roomPrice = roomPrice;
        this.roomDescription = roomDescription;
        this.roomFacilities = roomFacilities;
    }

    public RoomIdentifier getRoomIdentifier() {
        return roomIdentifier;
    }

    public int getRoomDoorNumber() {
        return roomDoorNumber;
    }

    public int getRoomFloor() {
        return roomFloor;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public RoomFacilities getRoomFacilities() {
        return roomFacilities;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomIdentifier=" + roomIdentifier +
                ", roomDoorNumber=" + roomDoorNumber +
                ", roomFloor=" + roomFloor +
                ", roomPrice=" + roomPrice +
                ", roomDescription='" + roomDescription + '\'' +
                ", roomFacilities=" + roomFacilities +
                '}';
    }
}
