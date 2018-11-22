package cn.ims.ims.demo.service;

import cn.ims.ims.demo.entity.po.OrderInfo;


import java.util.List;

public interface InformService {

    /**
     * 拒绝入职
     */
    boolean refuse(long id);

    /**
     * 准备入职
     */
    boolean prepare(long id);


    List<OrderInfo> selectOrder(String i);
}
