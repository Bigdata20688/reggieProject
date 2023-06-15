package edu.czjt.reggie.dto;

import edu.czjt.reggie.entity.OrderDetail;
import edu.czjt.reggie.entity.Orders;
import lombok.Data;

import java.util.List;
@Data

 /*  作者：庞宇航   功能：订单模块*/

public class OrdersDto extends Orders {

    private String userName;

    private String phone;

    private String address;

    private String consignee;

    private List<OrderDetail> orderDetails;

}
