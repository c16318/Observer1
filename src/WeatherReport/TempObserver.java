/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WeatherReport;

/**
 *
 * @author matsu
 */
public class TempObserver implements Observer{
        public void update(Generator generator){
        System.out.println(generator.getName()+"の気温:" + generator.getNumber());
        try{
            Thread.sleep(100);
        }catch(InterruptedException e){
            
        }
    }
}
