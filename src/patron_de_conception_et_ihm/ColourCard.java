package patron_de_conception_et_ihm;

/**
 * Created by tomgiraudet on 25/09/15.
 */
public class ColourCard {

    public enum ColourCard {
        SPADE, CLUB, HEART, DIAMOND
    }

    public static ColourCard getColour(final String name) {
        for (ColourCard cc : values())
            if (cc.name().equals(name))
                return cc;
        return null;
    }

    public static ColourCard getcolour2(final String name) {
        Arrays.asList(values());
    }
}
