/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WeatherReport;

import java.util.Random;

/**
 *
 * @author matsu
 */
public class TokyoGenerator extends Generator{
    Random random = new Random();
    int number = 8;
    String name = "Tokyo";
    
    public int getNumber(){
        return number;
    }
    
    public String getName(){
        return name;
    }
    
   //1づつ加算し通知
    public void execute(){
        for(int i = 0;i < 5;i++){
            number += 1;
            notifyObservers();
        }
    }
}
