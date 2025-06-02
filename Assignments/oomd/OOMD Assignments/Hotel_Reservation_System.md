Problem Statement- 3. Hotel Reservation System:
Design a system to manage hotel rooms, reservations, and guest information. 
The system should handle room availability, reservation processing, 
and guest check-in/check-out.

# Hotel Reservation System

## Analysis-
1. System should be able to manage hotel rooms.
2. System should manage reservations.
3. System should manage guest information.
4. System should handle room availability.
5. System should process Reservation.
6. System should handle guest check-in and check-out.

## Class

1. Hotel
    1. Attribute - id, name, receptionist, rooms : List<Room> , checkInTime,checkOutTime, guest : List<Guest>, history : map<bookingId, Guest>
    2. Behavior - get/set
   
2. Receptionist
    1. Attribute - id, name, phoneNo, roomAvailability(enum), reservation
    2. Behavior - get/set, addReservation, cancelReservation, managePayments, checkRoomAvailability
   
3. Room
    1. Attribute - number, capacity
    2. Behavior - get/set
   
4. Reservation
    1. Attribute- bookingId, guestName, paymentStatus(enum)
    2. Behavior - get/set
   
5. Guest
    1. Attribute - id, name, reservation
    2. Behavior- makePayment, checkIN, checkOut, bookReservation

## Enum
1. roomAvailability - Yes, No
2. PaymentStatus- Success, Failed
