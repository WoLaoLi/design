package com.cn.xx.designpatterns.facade;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/13
 * @description :
 */
public class HomeTheaterFacade {


    //定义各个子系统对象
    private TheaterLight theaterLight;

    private PopCorn popCorn;

    private Stereo stereo;

    private Projecter projecter;

    private Screen screen;

    private DVDPlayer dvdPlayer;


    /**
     * 构造器
     * @param
     * @param
     * @param
     * @param
     * @param
     * @param
     */
    public HomeTheaterFacade() {
        this.theaterLight = TheaterLight.getInstance();
        this.popCorn = PopCorn.getInstance();
        this.stereo = Stereo.getInstance();
        this.projecter = Projecter.getInstance();
        this.screen = Screen.getInstance();
        this.dvdPlayer = DVDPlayer.getInstance();
    }

    //操作分成四部

    public void ready(){
        popCorn.on();
        popCorn.pop();
        screen.down();
        projecter.on();
        stereo.on();
        dvdPlayer.open();
        theaterLight.dim();
    }

    public void play(){
        dvdPlayer.play();
    }

    public void pause(){
        dvdPlayer.pause();
    }

    public void end(){
        popCorn.off();
        theaterLight.birght();
        screen.up();
        projecter.off();
        dvdPlayer.off();

    }



}
