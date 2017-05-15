/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WeatherReport;

import java.util.ArrayList;

/**
 *
 * @author matsu
 */
public abstract class Generator {
     private ArrayList<Observer> observers = new ArrayList();//集約(has-a関係)
    
    //観察者の追加
    public void addObserver(Observer observer){
        observers.add(observer);
    }
    
    //観察者の削除
    public void deleteObserver(Observer observer){
        observers.remove(observer);
    }
    
    //登録されている観察者に upedate するようメッセージを送る
    public void notifyObservers(){
        /*for(Observer ob : observers){
            ob.update(this);
        }*/
        observers.forEach((ob) ->{
            ob.update(this);
        });
        
        
    }
    
    public abstract int getNumber();
          
    public abstract void execute();
    public abstract String getName(); 
}
