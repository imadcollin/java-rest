package ejb;

import javax.ejb.Remote;

@Remote
public interface AddInterface {
    int add(int a, int b);
}
