package patron_de_conception_et_ihm;

/**
 * Created by tomgiraudet on 25/09/15.
 */

public final class MyMath {
    public static final MyMath INSTANCE = new MyMath();

    private MyMath(){}

    public double toRadians(double angdeg){
        return angdeg / 180.0 * Math.PI;
    }

    public double toDegrees(double angrad){
        return andrad * 180.0 / MAth.PI;
    }
}