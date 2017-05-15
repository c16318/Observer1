
package WeatherReport;

import java.util.Random;

/**
 *
 * @author matsu
 */
public class KofuGenerator extends Generator{
    Random random = new Random();
    int number = 5;
    String name = "Kofu";
    
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
