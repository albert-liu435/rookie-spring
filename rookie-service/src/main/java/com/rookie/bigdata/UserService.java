package com.rookie.bigdata;

import org.springframework.util.StringUtils;

/**
 * @Classname UserService
 * @Description TODO
 * @Author rookie
 * @Date 2022/3/22 15:30
 * @Version 1.0
 */
public class UserService {


    public String getUserString(String str) {

        if (StringUtils.isEmpty(str))
            return "abc";

        return "cba";
    }
}
