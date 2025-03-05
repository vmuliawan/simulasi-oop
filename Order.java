/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author vmuli
 */
public class Order {
    private User user;
    private Food food;
    private String date;
    private static int count;
    public Order(User user, Food food, String date){
        this.user = user;
        this.food = food;
        this.date = date;
        count++;
    }
    
    public User getUser(){
        return user;
    }
    
    public Food getFood(){
        return food;
    }
    
    public String getDate(){
        return date;
    }
    
    public static int getCount(){
        return count;
    }
    
}
