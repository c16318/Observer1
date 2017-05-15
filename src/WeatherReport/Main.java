/*
 * 課題３
 *アメダスで観測される気温などの情報を取得して
 * その結果を表示するプログラムをObserveパターンを
 * 使って実現。
 * 複数の観測地点に対応すること。
 */
package WeatherReport;

/**
 *気象観測
 * @author c16318
 */
public class Main {
    public static void main(String[] args){
        Generator Kofugenerator = new KofuGenerator();
        Generator Tokyogenerator = new TokyoGenerator();
        Observer Tempobserver = new TempObserver();
        
        Kofugenerator.addObserver(Tempobserver);
        Tokyogenerator.addObserver(Tempobserver);
        

            Kofugenerator.execute();
            Tokyogenerator.execute();
            System.out.println();

    }
}
