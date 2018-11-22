package cn.ims.ims.demo.service;

import cn.ims.ims.demo.dao.OrderDao;
import cn.ims.ims.demo.entity.po.OrderInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    private OrderDao orderDao;

    /**
     * 预约
     * @return
     */
    @Override
    public boolean order(OrderInfo orderInfo) {
        int i=orderDao.order(orderInfo);
        if (i==1){
            return  true;
        }
        return false;
    }

    /**
     * 取消预约
     * @param id
     * @return
     */
    @Override
    public boolean cancelOrder(long id) {
        int i=orderDao.cancelOrder(id);
        if (i==1){
            return  true;
        }
        return false;
    }

    /**
     * 查询所有预约
     * @return
     */
    @Override
    public List<OrderInfo> selectOrder(int order_status) {
        List<OrderInfo> list=orderDao.selectOrder(order_status);
        if (list.size()>0){
            return  list;
        }
        return null;
    }


}
