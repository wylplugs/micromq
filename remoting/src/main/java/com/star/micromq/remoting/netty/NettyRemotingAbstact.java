package com.star.micromq.remoting.netty;

import com.star.micromq.remoting.protocol.RemotingMessage;
import io.netty.channel.ChannelHandlerContext;

/**
 * @author wuyulong
 * @date 2019/7/14
 * @desc
 **/
public abstract class NettyRemotingAbstact {


    public void processMessageReceived(ChannelHandlerContext ctx, RemotingMessage msg){
        final RemotingMessage cmd = msg;
        if (cmd != null){
            switch (cmd.getType()){
                case RESQUEST_COMMAND:
                    processRequestCommand(ctx, cmd);
                    break;
                case RESPONSE_COMMAND:
                    processResponseCommand(ctx, cmd);
                    break;
                default:
                    break;
            }
        }
    }

    public void processRequestCommand(ChannelHandlerContext ctx, RemotingMessage msg){

    }

    public void processResponseCommand(ChannelHandlerContext ctx, RemotingMessage msg){

    }
}
