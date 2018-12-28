package com.yunfei.mp.common.auth;

import com.yunfei.mp.entity.AccountEntity;

/**
 * 描述:
 *
 * @author rasonboy
 * @version 1.0
 * @date 2018/12/25  16:17
 * JDK版本：sun jdk 1.8
 */
public interface TokenManager {
    /**
     * 创建token
     * @param userInfo
     * @return
     */
    String getToken(AccountEntity userInfo);

    /**
     * 刷新用户
     * @param token
     */
    void refreshUserToken(String token);

    /**
     * 用户退出登陆
     * @param token
     */
    void loginOff(String token);

    /**
     * 获取用户信息
     * @param token
     * @return
     */
    AccountEntity getUserInfoByToken(String token);
}
