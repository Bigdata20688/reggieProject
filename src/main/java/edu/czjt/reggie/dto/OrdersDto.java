package edu.czjt.reggie.dto;

import edu.czjt.reggie.entity.OrderDetail;
import edu.czjt.reggie.entity.Orders;
import lombok.Data;

import java.util.List;
@Data

/**
 * 庞宇航   订单


 */

public class OrdersDto extends Orders {

    private String userName;

    private String phone;

    private String address;

    private String consignee;

    private List<OrderDetail> orderDetails;

}
