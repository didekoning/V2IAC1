package BusinessLogic;

import java.text.DecimalFormat;

/**
 * Created by Dion on 3/13/2017.
 */
public class Calculate {
    public double weight;
    public double height;
    public double result;

    public Calculate(double weight, double height){
        this.weight = weight;
        this.height = height / 100;
    }
    public String calculate(){
        this.result = weight / (height * height);
        DecimalFormat df = new DecimalFormat("#.0");
        return df.format(result);
    }
}
