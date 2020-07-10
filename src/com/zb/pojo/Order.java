package com.zb.pojo;

import java.sql.Timestamp;

public class Order {
    private Integer id;
    private Integer door_id;
    private String order_no;
    private String order_type;
    private Integer pnum;
    private String cashier;
    private Timestamp order_time;
    private Timestamp pay_time;
    private String pay_type;
    private double price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDoor_id() {
        return door_id;
    }

    public void setDoor_id(Integer door_id) {
        this.door_id = door_id;
    }

    public String getOrder_no() {
        return order_no;
    }

    public void setOrder_no(String order_no) {
        this.order_no = order_no;
    }

    public String getOrder_type() {
        return order_type;
    }

    public void setOrder_type(String order_type) {
        this.order_type = order_type;
    }

    public Integer getPnum() {
        return pnum;
    }

    public void setPnum(Integer pnum) {
        this.pnum = pnum;
    }

    public String getCashier() {
        return cashier;
    }

    public void setCashier(String cashier) {
        this.cashier = cashier;
    }

    public Timestamp getOrder_time() {
        return order_time;
    }

    public void setOrder_time(Timestamp order_time) {
        this.order_time = order_time;
    }

    public Timestamp getPay_time() {
        return pay_time;
    }

    public void setPay_time(Timestamp pay_time) {
        this.pay_time = pay_time;
    }

    public String getPay_type() {
        return pay_type;
    }

    public void setPay_type(String pay_type) {
        this.pay_type = pay_type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "OrderDao{" +
                "id=" + id +
                ", door_id=" + door_id +
                ", order_no='" + order_no + '\'' +
                ", order_type='" + order_type + '\'' +
                ", pnum=" + pnum +
                ", cashier='" + cashier + '\'' +
                ", order_time=" + order_time +
                ", pay_time=" + pay_time +
                ", pay_type='" + pay_type + '\'' +
                ", price=" + price +
                '}';
    }
}
