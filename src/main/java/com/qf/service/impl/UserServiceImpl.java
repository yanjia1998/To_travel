package com.qf.service.impl;

import com.qf.common.BaseResp;
import com.qf.dao.UserMapper;
import com.qf.pojo.User;
import com.qf.pojo.req.UserReq;
import com.qf.service.UserService;
import com.qf.utils.RedisUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    JavaMailSender javaMailSender;
    @Autowired
    RedisUtils redisUtils;
    @Value("${spring.mail.username}")
    private String from;
    @Override
    public BaseResp sendMail(String email) {
        BaseResp baseResp = new BaseResp();
    if (email!=null){
        User user = userMapper.findByEmail(email);
        if (user!= null){
            baseResp.setCode(201);
            baseResp.setMessage("该邮箱已被禁用");
            return baseResp;
        }
        Random random = new Random();
        StringBuffer code = new StringBuffer();
        for (int i = 0;i<4;i++) {
            int i1 = random.nextInt(10);
            code.append(i1);
        }
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom(from);
        simpleMailMessage.setTo(email);
        simpleMailMessage.setSubject("验证码");
        simpleMailMessage.setText(code.toString());
        javaMailSender.send(simpleMailMessage);
        redisUtils.set(email,code.toString());
        redisUtils.expire(email,60);
        baseResp.setCode(200);
        baseResp.setMessage("验证码发送成功");
        return baseResp;
    }
    baseResp.setCode(203);
    baseResp.setMessage("邮箱不能为空");

        return baseResp;
    }

    @Override
    public BaseResp registry(UserReq userReq) {
        BaseResp baseResp = new BaseResp();
        String userName = userReq.getUserName();
        User user = userMapper.findUserName(userName);
        if (user !=null){
            baseResp.setCode(201);
            baseResp.setMessage("账户已存在");
        return  baseResp;
        }
        String code = userReq.getCode();
        String email = userReq.getEmail();
        String s = (String) redisUtils.get(email);
        if (s!=null &&code.equals(s)){
            User user1 = new User();
            BeanUtils.copyProperties(userReq,user1);
            userMapper.registry(user1);
            baseResp.setCode(200);
            baseResp.setMessage("用户注册成功");
            return baseResp;
        }

        baseResp.setCode(205);
        baseResp.setMessage("用户注册失败");;
        return baseResp;
    }

    @Override
    public BaseResp login(UserReq userReq) {
        BaseResp baseResp = new BaseResp();
        String userName = userReq.getUserName();
        User user = userMapper.findUserName(userName);

        if (userReq.getPassword()!=null&&userReq.getPassword().equals(user.getPassword())){
            UUID uuid = UUID.randomUUID();
            redisUtils.set(uuid.toString(),user);
            baseResp.setData(uuid.toString());
            baseResp.setCode(200);
            return baseResp;
        }

        baseResp.setCode(204);
        baseResp.setMessage("密码或账户名错误！");
        return baseResp;

    }


    @Override
    public void updateUser(User user) {
       userMapper.updateUser(user);
    }
}
