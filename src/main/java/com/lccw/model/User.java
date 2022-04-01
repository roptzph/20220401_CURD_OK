package com.lccw.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private  Integer id;
    private  String cname;
    private  Integer age;
    private  String email;

}
