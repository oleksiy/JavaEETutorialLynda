package beans;

import javax.ejb.Local;

@Local
public interface ConverterBeanLocal {

    public enum ConvertType{
        C2F, F2C
    }

    public double calculate(double value, ConvertType type);
}
