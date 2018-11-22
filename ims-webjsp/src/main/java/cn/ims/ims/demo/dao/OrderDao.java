package cn.ims.ims.demo.dao;

import cn.ims.ims.demo.entity.po.OrderInfo;

import java.util.List;

public interface OrderDao {
    /**
     * 预约
     * @param orderInfo
     * @return
     */
    public int order(OrderInfo orderInfo);

    /**
     * 取消预约
     * @param id
     * @return
     */
    public int cancelOrder(long id);

    /**
     * 查询所有预约
     * @return
     */
    public List<OrderInfo> selectOrder(int order_status);
}
