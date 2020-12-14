package com.qf.service;

import com.qf.common.BaseResp;
import com.qf.pojo.User;
import com.qf.pojo.req.UserReq;

public interface UserService {
    BaseResp sendMail(String email);

    BaseResp registry(UserReq userReq);

    BaseResp login(UserReq userReq);

    void updateUser(User user);
}
