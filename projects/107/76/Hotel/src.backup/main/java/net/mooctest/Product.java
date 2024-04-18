package net.mooctest;
/**
 * @Author: xuexb
 * @Date: 2019.7.17 13:19
 */
public class Product{
    public double price;
    public double discount = 1;
    public String name;
    public int count; // 数量

    public Product(String name, double price, int count){
        this.setName(name);
        this.setPrice(price);
        this.setCount(count);
    }

    //获取商品售卖时最终定�?
    public double getPaymentPrice(){
        return price * discount;
    }

    //设置商品价格
    public void setPrice(double price){
        if(price<=0)
            throw new IllegalArgumentException("Price cannot less than 0: "+price);
        if((price+"").length()-(price+"").indexOf(".")-1 > 2){
            throw new IllegalArgumentException("Price's length is wrong: "+price);
        }
        this.price = price;
    }

    //设置商品折扣
    public void setDiscount(double discount){
        if(discount<=0)
            throw new IllegalArgumentException("Discount cannot less than 0: "+discount);
        if(discount>1)
        	throw new IllegalArgumentException("Discount cannot larger than 1: "+discount);
        if((discount+"").length()-(discount+"").indexOf(".")-1 > 2){
            throw new IllegalArgumentException("Discount's length is wrong: "+discount);
        }
        this.discount = discount;
    }

    //设置商品名称
    public void setName(String name){
        char [] data = name.toCharArray();
        for( char c: data){
            if(!(('a'<=c&&c<='z')||('A'<=c&&c<='Z'))){
                throw new IllegalArgumentException("Please enter English characters: "+name);
            }
        }
        if (name.length()>20){
            throw new IllegalArgumentException("The length of product's name cannot longer than 20: "+name);
        }
        this.name = name;
    }

    //设置商品数量
    public void setCount(int count){
        if (count<=0){
            throw new IllegalArgumentException("Quantity should larger than 0: "+count);
        }
        this.count = count;
    }

    //获取商品信息
    public String getInfo(){
        String discount_info = ""+(int)(this.discount*100)+"%";
        String sep = System.getProperty("line.separator");
        if(this.discount==1)
            discount_info = "No discount";
        String info = "Name�?"+this.name+
                sep +"Price�?"+OrderItem.formatDouble(this.price)+"Yuan"+
                sep +"Discount: "+discount_info+
                sep +"Quantity�?"+this.count;
        return info;
    }


}
