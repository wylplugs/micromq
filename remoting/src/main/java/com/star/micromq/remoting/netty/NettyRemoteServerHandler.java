package com.star.micromq.remoting.netty;

import com.star.micromq.remoting.RemoteServerHandler;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

import java.nio.charset.Charset;

/**
 * @author wuyulong
 * @date 2019/7/13
 * @desc 使用netty协议的服务端
 **/
public class NettyRemoteServerHandler extends ChannelInboundHandlerAdapter implements RemoteServerHandler {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        ByteBuf byteBuf = (ByteBuf) msg;
        System.out.println(byteBuf.toString(Charset.forName("utf-8")));
        ctx.writeAndFlush(msg);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        // 出现异常时关闭连接。
        cause.printStackTrace();
        ctx.close();
    }

    @Override
    public void registerBroker(String msg) {

    }
}
