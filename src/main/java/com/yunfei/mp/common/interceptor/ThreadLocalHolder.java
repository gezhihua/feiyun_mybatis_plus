package com.yunfei.mp.common.interceptor;

import com.yunfei.mp.entity.AccountEntity;


/**
 * Thread工具类
 *
 * @author rasonboy
 * @email rasonboy@freedotech.com
 * @date 2018-12-24 09:58:52
 */
public class ThreadLocalHolder {

	private static ThreadLocal<AccountEntity> userThreadLocal = new ThreadLocal<AccountEntity>();
	
	private static ThreadLocal<String> tokenThreadLocal = new ThreadLocal<String>();  
	
	public static AccountEntity getAccount(){
		return userThreadLocal.get();
	}
	
	public static void setAccount(AccountEntity t){
		userThreadLocal.set(t);
	}

	public static void setToken(String token){
		tokenThreadLocal.set(token);
	}
	
	public static String getToken(){
		return tokenThreadLocal.get();
	}
}
