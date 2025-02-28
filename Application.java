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
    private String date;
    
    public void addNewFood(Food food){
        newFood.add(food);
    }
    
    public void displayFoods(){
        System.out.println("Food List: ");
        System.out.println("----------------------------------------------------------");
        for(Food food : newFood){
            System.out.println(food.getFoodName()+" ("+food.getCalories()+" Kcal)");
            System.out.println("Description: "+food.getDesc());
            System.out.println("Spicy level: "+food.getLevel());
            System.out.println("Ingredients: ");
            for(int i = 0; i < food.getIngredient();i++){
                System.out.print(ingredient+", ");
            }
            
            System.out.println("\n-------------------------------------------------------");
        }
    }
    
    public void order(User user, Food food, String date){
        
        this.date = date;
    }
    
    public String getDate(){
        return date;
    }
    
//    public void displayOrders(){
//        for()
//    }
}
