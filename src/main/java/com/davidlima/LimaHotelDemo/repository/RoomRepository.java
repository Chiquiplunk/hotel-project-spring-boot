package com.davidlima.LimaHotelDemo.repository;

import com.davidlima.LimaHotelDemo.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Description of RoomRepository.
 *
 * @author David Lima
 */

public interface RoomRepository extends JpaRepository<Room, Long> {

    @Query("SELECT DISTINCT r.roomType FROM Room r")
    List<String> findDistinctRoomTypes();
}

