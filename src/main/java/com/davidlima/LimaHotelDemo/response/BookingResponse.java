package com.davidlima.LimaHotelDemo.response;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * Description of BookingResponse.
 *
 * @author David Lima
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingResponse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//generated primary key
    private Long booKingId;

    @Column(name = "check_In")
    private LocalDate checkInDate;

    @Column(name = "check_Out")
    private LocalDate checkOutDate;

    @Column(name = "guest_FullName")
    private String guestName;

    @Column(name = "guest_Email")
    private String guestEmail;

    @Column(name = "adults")
    private int NumOfAdults;

    @Column(name = "children")
    private int NumOfChildren;

    @Column(name = "total_Guest")
    private int totalNumOfGuest;

    @Column(name = "confirmation_Code")
    private String bookingConfirmationCode;

    private RoomResponse room;

    public BookingResponse(Long booKingId, LocalDate checkInDate, LocalDate checkOutDate, String bookingConfirmationCode) {
        this.booKingId = booKingId;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.bookingConfirmationCode = bookingConfirmationCode;
    }
}

