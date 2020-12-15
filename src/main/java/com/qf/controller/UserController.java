package com.qf.controller;

import com.qf.common.BaseResp;
import com.qf.common.UploadUtils;
import com.qf.pojo.User;
import com.qf.pojo.req.UserReq;
import com.qf.service.UserService;
import com.qf.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    RedisUtils redisUtils;
         @Autowired
         UserService userService;
         @Autowired
    UploadUtils uploadUtils;
        @RequestMapping("/sendMail")
        private BaseResp sendMail(@RequestParam("email")String email){
            return userService.sendMail(email);
         }
            @RequestMapping(value = "/registry",method = RequestMethod.POST)
            private BaseResp registry(@RequestBody UserReq userReq){
                return userService.registry(userReq);
            }
            @RequestMapping(value = "/login",method = RequestMethod.POST)
            private BaseResp login(@RequestBody UserReq userReq ){
                return userService.login(userReq);
            }
            @RequestMapping(value = "/update",method = RequestMethod.POST)
           public  BaseResp updateUser( User user){
              //  String userName = (String)redisUtils.get(user.getUserName());
                user.setUserName(user.getUserName());
             //   String password = (String)redisUtils.get(user.getPassword());
                user.setPassword(user.getPassword());
              //  String sex = (String)redisUtils.get(user.getSex());
                user.setSex(user.getSex());
                user.setHead(user.getHead());
                userService.updateUser(user);
                BaseResp baseResp = new BaseResp();
                baseResp.setCode(200);
                baseResp.setMessage("修改成功");
                return baseResp;

            }
        @RequestMapping(value = "/upload",method = RequestMethod.POST)
        public BaseResp upload(@RequestParam("file") MultipartFile multipartFile){
        return uploadUtils.upload(multipartFile);

    }

}
