package com.qf.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
public class User {
        private  Integer id;
        private String userName;
        private  String sex;
        private String password;
        private  String email;
        private  String head;
}
