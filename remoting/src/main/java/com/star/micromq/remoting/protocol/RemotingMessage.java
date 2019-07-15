package com.star.micromq.remoting.protocol;

/**
 * @author wuyulong
 * @date 2019/7/14
 * @desc 远程通信的消息体封装
 **/
public class RemotingMessage {

    private RemotingCommandType type;

    public RemotingCommandType getType() {
        return type;
    }

    public void setType(RemotingCommandType type) {
        this.type = type;
    }
}
