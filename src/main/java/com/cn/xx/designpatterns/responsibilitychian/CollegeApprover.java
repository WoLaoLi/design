package com.cn.xx.designpatterns.responsibilitychian;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/26
 * @description :
 */
public class CollegeApprover extends Approver {

    public CollegeApprover(String name){
        super(name);

    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() <= 10000
        && purchaseRequest.getPrice() > 5000){
            System.out.println("请求编号："+purchaseRequest.getId()+"被"+this.name+"处理");
        }else{
            approver.processRequest(purchaseRequest);
        }
    }

}
