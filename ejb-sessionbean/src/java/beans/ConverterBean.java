package beans;

import javax.ejb.Stateless;

@Stateless
public class ConverterBean implements ConverterBeanLocal {
    public ConverterBean() {
    }

    @Override
    public double calculate(double value, ConvertType type) {

        if(type == ConvertType.C2F){
            return value * 2 + 30;
        } else if (type == ConvertType.F2C){
            return (value - 32) / 1.8;
        }

        return 0.0;
    }
}
