package com.cn.xx.designpatterns.responsibilitychian;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/26
 * @description :
 */
public class ViceShcoolMasterApprover extends Approver {


    public ViceShcoolMasterApprover(String name){
        super(name);

    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() <= 30000
                && purchaseRequest.getPrice() > 10000){
            System.out.println("请求编号："+purchaseRequest.getId()+"被"+this.name+"处理");
        }else{
            approver.processRequest(purchaseRequest);
        }
    }

}
