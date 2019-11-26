package com.cn.xx.designpatterns.memento.game;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/24
 * @description :
 */
public class GameRole {


    private Integer vit;
    private Integer def;


    /**
     * 创建Memento,即根据当前状态得到Memento
     */
    public Memento createMemento(){
        return new Memento(vit,def);
    }

    /**
     * 从备忘录对象恢复gameRole的状态
     *
     */
    public void recoverGameRoleFromMemento(Memento memento){

        this.vit = memento.getVit();
        this.def = memento.getDef();

    }


    /**
     * 显示当前状态
     */
    public void display(){
        System.out.println("当前攻击力"+this.vit+"当前防御力"+this.def);
    }

    public Integer getVit() {
        return vit;
    }

    public void setVit(Integer vit) {
        this.vit = vit;
    }

    public Integer getDef() {
        return def;
    }

    public void setDef(Integer def) {
        this.def = def;
    }
}
