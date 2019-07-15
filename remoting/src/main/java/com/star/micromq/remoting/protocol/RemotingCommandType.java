package com.star.micromq.remoting.protocol;

/**
 * @author wuyulong
 * 远程通信协议类型
 */
public enum RemotingCommandType {

    /**
     * 请求类型的远程命令
     */
    RESQUEST_COMMAND,

    /**
     * 相应类型的远程命令
     */
    RESPONSE_COMMAND;
}
