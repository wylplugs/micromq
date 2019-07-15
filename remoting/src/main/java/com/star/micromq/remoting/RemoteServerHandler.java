package com.star.micromq.remoting;

/**
 * @author wuyulong
 * @date 2019/7/13
 * @desc 定义远程通信服务端接口
 **/
public interface RemoteServerHandler {

    /**
     * 注册broker
     * @param msg
     */
    void registerBroker(String msg);
}
