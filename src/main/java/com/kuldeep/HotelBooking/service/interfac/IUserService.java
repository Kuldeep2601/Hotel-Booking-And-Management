package com.kuldeep.HotelBooking.service.interfac;

import com.kuldeep.HotelBooking.entity.User;
import com.kuldeep.HotelBooking.dto.LoginRequest;
import com.kuldeep.HotelBooking.dto.Response;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}
