package com.yunfei.mp.controller;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.yunfei.mp.common.annotation.UserLoginToken;
import com.yunfei.mp.common.utils.MD5Util;
import com.yunfei.mp.entity.AccountEntity;
import com.yunfei.mp.service.IAccountService;
import com.yunfei.mp.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 描述:
 *
 * @author rasonboy
 * @version 1.0
 * @date 2018/12/25  17:25
 * JDK版本：sun jdk 1.8
 */
@RestController
@RequestMapping("/user")
public class LoginController {
    @Autowired
    IAccountService userService;
    @Autowired
    TokenService tokenService;
    //登录
    @PostMapping("/login")
    public Object login(@RequestBody AccountEntity user){

        JSONObject jsonObject = new JSONObject();
        AccountEntity userForBase=userService.selectOne(new EntityWrapper<AccountEntity>().eq("account", user.getAccount()));
        if(userForBase==null){
            jsonObject.put("message","登录失败,用户不存在");
            return jsonObject;
        }else {
            String userPass = MD5Util.encrypt(user.getPassword());
            if (!userForBase.getPassword().equals(userPass)){
                jsonObject.put("message","登录失败,密码错误");
                return jsonObject;
            }else {
                String token = tokenService.getToken(userForBase);
                jsonObject.put("token", token);
                jsonObject.put("user", userForBase);
                return jsonObject;
            }
        }
    }
    @UserLoginToken
    @GetMapping("/getMessage")
    public String getMessage(){
        return "你已通过验证";
    }
}
