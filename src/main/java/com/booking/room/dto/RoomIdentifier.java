package com.booking.room.dto;

public class RoomIdentifier {
    private final String roomId;

    private final RoomType roomType;

    public RoomIdentifier(String roomId, RoomType roomType) {
        this.roomId = roomId;
        this.roomType = roomType;
    }

    public String getRoomId() {
        return roomId;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    @Override
    public String toString() {
        return "RoomIdentifier{" +
                "roomId='" + roomId + '\'' +
                ", roomType=" + roomType +
                '}';
    }
}
