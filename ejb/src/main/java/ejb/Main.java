package ejb;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Properties;

public class Main {
    BufferedReader brConsoleReader = null;
    Properties props;
    static InitialContext ctx;

    public Main() {
        init();
    }

    private void init() {
        try {
            ctx = new InitialContext(Constants.map);
        } catch (NamingException ex) {
            ex.printStackTrace();
        }
        brConsoleReader =
                new BufferedReader(new InputStreamReader(System.in));
    }

    public static void main(String[] args) throws NamingException {
        Main main = new Main();

        // Context context = new InitialContext();
        // AddInterface remote = (AddInterface) Main.ctx.lookup("st1");
        //System.out.println(remote.add(32, 32));
    }
}
