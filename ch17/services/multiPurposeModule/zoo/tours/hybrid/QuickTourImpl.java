package zoo.tours.hybrid;

import zoo.tours.api.Souvenir;
import zoo.tours.api.Tour;

public class QuickTourImpl implements Tour {
    @Override
    public String name() {
        return "Short Tour";
    }

    @Override
    public int length() {
        return 30;
    }

    @Override
    public Souvenir getSouvenir() {
        Souvenir gift = new Souvenir();
        gift.setDescription("keychain");
        return gift;
    }


}
