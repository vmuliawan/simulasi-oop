/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author vmuli
 */
public class User {
    private String nim;
    private String name;
    
    public User(String nim, String name){
        this.nim = nim;
        this.name = name;
    }
    
    public String getNim(){
        return nim;
    }
    
    public String getName(){
        return name;
    }
}
