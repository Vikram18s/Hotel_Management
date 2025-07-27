package com.Havenwood.HavenwoodHotel.service.interfac;

import com.Havenwood.HavenwoodHotel.dto.LoginRequest;
import com.Havenwood.HavenwoodHotel.entity.User;
import com.Havenwood.HavenwoodHotel.dto.Response;

public interface IUserService {

    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}
