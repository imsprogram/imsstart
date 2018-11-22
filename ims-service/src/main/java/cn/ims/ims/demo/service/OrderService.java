package cn.ims.ims.demo.service;

import cn.ims.ims.demo.entity.po.OrderInfo;

import java.util.List;

public interface OrderService {

    /**
     * 预约
     * @return
     */
    public boolean order(OrderInfo orderInfo);
    /**
     * 取消预约
     * @return
     */
    public boolean cancelOrder(long id);
    /**
     * 查询所有预约
     * @return
     */
    public List<OrderInfo> selectOrder(int order_status);

}
