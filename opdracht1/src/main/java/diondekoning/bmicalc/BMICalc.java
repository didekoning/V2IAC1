package diondekoning.bmicalc;

import java.text.DecimalFormat;

/**
 * Created by Dion on 06/03/2017.
 */
public class BMICalc {
    public double height;
    public double weight;
    public double result;

    public BMICalc(double height, double weight) {
        this.height = height / 100;
        this.weight = weight;
    }

    public String calculate(){
        this.result = weight / (height * height);
        DecimalFormat df = new DecimalFormat("#.0");
        return df.format(result);
    }
}
