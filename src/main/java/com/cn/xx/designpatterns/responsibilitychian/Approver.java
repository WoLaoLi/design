package com.cn.xx.designpatterns.responsibilitychian;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/26
 * @description :
 */
public abstract class Approver {

    /**
     * 下一个处理者
     */
    Approver approver;

    String name;

    public Approver(String name) {
        this.name = name;
    }


    /**
     * 下一个处理者
     * @param approver
     */
    public void setApprover(Approver approver) {
        this.approver = approver;
    }


    /**
     * 处理审批请求的方法,得到一个请求，子类完成，该方法抽象
     */
    public abstract void processRequest(PurchaseRequest purchaseRequest);

}
