package com.star.micromq.namesrv;

/**
 * @author wuyulong
 * @date 2019/7/13
 * @desc 注册中心的启动类
 **/
public class NamesrvStartup {

    public static void main(String[] args) {

    }

    public static NamesrvController main0(String[] args){
        NamesrvController controller = createNamesrvController(args);
        try {
            start(controller);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }
        return controller;
    }

    public static NamesrvController createNamesrvController(String[] args){

        return new NamesrvController();
    }

    public static NamesrvController start(final NamesrvController controller) throws Exception{
        if (controller == null){
            throw new IllegalArgumentException("NamesrvController is null.");
        }

        return controller;
    }
}
