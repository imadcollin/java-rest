package ejb;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Constants {
    public static Hashtable<String, String> map = new Hashtable<>();

    static {
        map.put("java.naming.factory.initial", "org.jnp.interfaces.NamingContextFactory");
        map.put("java.naming.factory.url.pkgs", "org.jboss.naming:org.jnp.interfaces");
        map.put("java.naming.provider.url", "localhost");
    }

}
