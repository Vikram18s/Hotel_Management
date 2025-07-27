package com.Havenwood.HavenwoodHotel.service.interfac;

import com.Havenwood.HavenwoodHotel.dto.LginRequest;
import com.Havenwood.HavenwoodHotel.entity.User;
import com.Havenwood.HavenwoodHotel.dto.Response;

public interface IUserService {

    Response register(User user);

    Response login(LginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}
