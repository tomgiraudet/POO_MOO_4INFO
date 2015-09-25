package patron_de_conception_et_ihm;

/**
 * Created by tomgiraudet on 25/09/15.
 */


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class fabrique_poids_mouchee {
    private static HashMap<Class<?>, Integer> quotas = new HashMap<>();
    private static HashMap<Class<?>, List<?>> instances = new HashMap<>();

    public static void addClassToBuild(Class c, int nb) {
        quotas.putIfAbsent(c, nb);
        instances.putIfAbsent(c, new ArrayList<>());
    }

    public static <T> T createInstance(Class<T> t) throws IllegalAccessException, InstantiationException {
        int quota = quotas.getOrDefault(t, 0);

        if(quota != 0) {
            //Vieux cast des familles
            List<T> list = (List<T>) instances.get(t);

            if(list.size() < quota) {
                T instance = t.newInstance();
                list.add(instance);
                return instance;
            }
            else
                return list.get((new Random()).nextInt(list.size()));
        }

        return null;
    }
}

