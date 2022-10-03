package ejb;

import javax.ejb.Stateless;

@Stateless
public class Adder implements AddInterface{
    public int add(int a, int b) {
        return a+b;
    }
}

