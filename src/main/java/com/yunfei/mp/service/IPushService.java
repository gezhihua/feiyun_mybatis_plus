package com.yunfei.mp.service;

/**
 * 描述:
 *
 * @author rasonboy
 * @version 1.0
 * @date 2018/12/27  17:37
 * JDK版本：sun jdk 1.8
 */
public interface IPushService {

    public void pushToApp();

    public void PushtoSingle();

    public void pushForList();

    public void pushForBatch();
}
