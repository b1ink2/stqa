package net.mooctest;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Order {
    public static List<Order> orders = new ArrayList<>();





    private List<OrderItem> items;
    public Order(List<OrderItem> items){
        this.items = items;
    }

    public void setItems(List<OrderItem> items){
        this.items = items;
    }

    //////
    public double totalAmount(){
        double total = 0;
        for (OrderItem item:items)
            total+=item.getAmount();
        return total;
    }

    //新增订单
    public static void createOrder(List<OrderItem> orderItems){
        Order newOrder = new Order(orderItems);
        if (newOrder.totalAmount()>=500 && newOrder.totalAmount()<1000){
            orderItems.stream().forEach(orderItem -> {
                orderItem.setPaymentPrice(orderItem.getPaymentPrice()*0.9);
            });
        }else if (newOrder.totalAmount()>=1000){
            orderItems.stream().forEach(orderItem -> {
                orderItem.setPaymentPrice(orderItem.getPaymentPrice()*0.8);
            });
        }
        newOrder.setItems(orderItems);
        orders.add(newOrder);
    }
    
    //打印全部�?售记�?
    public static void printOrders(){
        double allAmount = 0;
        for(int i = 0; i < orders.size(); i++){
            Order order = orders.get(i);
            System.out.println("Order No."+(i+1));
            allAmount += order.totalAmount();
            order.printOrderDetails();
            System.out.println();
        }
        System.out.println("AllAmount: "+formatDouble(allAmount));
    }

    //获取金额�?大的订单
    public static Order searchMaxOrder(){
        orders.sort((o1, o2) -> {
            if (o1.totalAmount()>o2.totalAmount())
                return -1;
            else
                return 1;
        });
        return orders.get(0);
    }

    /////
    public void printOrderDetails(){
        items.stream().forEach(orderItem -> {
            System.out.println(orderItem.PrintOrderItem());
        });
        System.out.println("Order Total:"+formatDouble(totalAmount()));
    }

    ////////
    public static String formatDouble(double d) {
        DecimalFormat df = new DecimalFormat("#.00");
        df.setRoundingMode(RoundingMode.DOWN);
        return df.format(d);
    }


    public List<OrderItem> getItems() {
        return items;
    }
}
