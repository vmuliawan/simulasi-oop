/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;
import java.util.*;
/**
 *
 * @author vmuli
 */
public class Application {
    private ArrayList<Food> newFood = new ArrayList<>();
    private ArrayList<Order> ordered = new ArrayList<>();
    private String date;
    
    public void addNewFood(Food food){
        newFood.add(food);
        System.out.println(food.getFoodName()+" successfully added to the kitchen");
    }
    
    public void displayFoods(){
        System.out.println("Food List: ");
        System.out.println("----------------------------------------------------------");
        for(Food food : newFood){
            System.out.println(food.getFoodName()+" ("+food.getCalories()+" Kcal)");
            System.out.println("Description: "+food.getDesc());
            System.out.println("Spicy level: "+food.getLevel());
            System.out.println("Ingredients: ");
            food.displayFd();
            
            System.out.println("\n-------------------------------------------------------");
        }
    }
    
    public void order(User user, Food food, String date){
        Order orders = new Order(user,food,date);
        ordered.add(orders);
        System.out.println(orders.getUser().getName()+" ordered "+orders.getFood().getFoodName()+" on "+orders.getDate());
    }
    
    
    public void displayOrders(){
        System.out.println("Order List: ");
        System.out.println("-------------------------------------------------");
        for(Order order : ordered){
            System.out.println("User: "+order.getUser().getName());
            System.out.println("Food: "+order.getFood().getFoodName());
            System.out.println("Date: "+order.getDate());
            System.out.println("-------------------------------------------------");
        }
    }
}
