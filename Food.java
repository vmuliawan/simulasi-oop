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
public class Food {
    private String foodName;
    private String desc;
    private int level;
    private int calories;
    private ArrayList<Ingredient> ingredients = new ArrayList<>();
    
    public Food(String foodName, String desc, int level, int calories){
        this.foodName = foodName;
        this.desc = desc;
        this.level = level;
        this.calories = calories;
    }
    
    public String getFoodName(){
        return foodName;
    }
    public String getDesc(){
        return desc;
    }
    public int getLevel(){
        return level;
    }
    public int getCalories(){
        return calories;
    }
    
    public void addIngredient(Ingredient ingredient){
        ingredients.add(ingredient);
    }
    
    public List<Ingredient> getIngredient(){
        return ingredients;
    }
}
