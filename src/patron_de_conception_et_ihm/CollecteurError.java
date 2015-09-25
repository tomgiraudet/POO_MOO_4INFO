package patron_de_conception_et_ihm;

/**
 * Created by tomgiraudet on 25/09/15.
 */

public enum ColourCard {
    SPADE, CLUB, HEART, DIAMON;

    public static ColourCard getColour(final String name) {
        for(ColourCard cc : values ())
            if(cc.name().equals(name))
                return cc;
        return null;
    }

    public static Optional<ColourCard> getColour2(final String name) {
        // First option :
        //Optional<ColourCard> opt = Arrays.stream(values()).filter(cc -> cc.name().equals(name)).findFirst();
        //return null;

        // Second option :
        return Arrays.stream(values()).filter(cc -> cc.name().equals(name)).findFirst();

    }
}

