package edu.czjt.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import edu.czjt.reggie.entity.Orders;

public interface OrderService extends IService<Orders> {

    /**
     * 庞宇航   用户下单


     */
    public void submit(Orders orders);

    public void submitAgain(Orders orders);
}
