package com.cn.xx.designpatterns.responsibilitychian;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/26
 * @description :
 */
public class Client {

    public static void main(String[] args) {
        //创建请求
        PurchaseRequest purchaseRequest = new PurchaseRequest(1, 31000, 1);


        //创建相关的审批人
        DepartmentApprover departmentApprover = new DepartmentApprover("李主任");

        CollegeApprover collegeApprover = new CollegeApprover("李院长");

        ViceShcoolMasterApprover viceShcoolMasterApprover = new ViceShcoolMasterApprover("李副校");

        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("李校长");


        //将各个审批级别的下一个设置好(处理人构成环形)
        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(viceShcoolMasterApprover);
        viceShcoolMasterApprover.setApprover(schoolMasterApprover);
        schoolMasterApprover.setApprover(departmentApprover);


        departmentApprover.processRequest(purchaseRequest);
    }

}
