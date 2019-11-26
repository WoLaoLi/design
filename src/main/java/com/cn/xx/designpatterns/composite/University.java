package com.cn.xx.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/12
 * @description : 就是Composite  可以管理college
 */
public class University extends OrganizationComponent {


    List<OrganizationComponent> organizationComponents = new ArrayList<>();




    public University(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public List<OrganizationComponent> getOrganizationComponents() {
        return organizationComponents;
    }

    public void setOrganizationComponents(List<OrganizationComponent> organizationComponents) {
        this.organizationComponents = organizationComponents;
    }

    /**
     * 输出包含的University
     */
    @Override
    protected void print() {

        System.out.println(getName());
        organizationComponents.forEach(x -> {
            x.print();
        });
    }
}
