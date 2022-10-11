package Factory;

import Factory.ChefKnife;
import Factory.Knife;
import Factory.KnifeStore;

public class AmericanKnifeStore extends KnifeStore {

    @Override
    protected Knife createKnife(String type) {
        if (type.equals("chef")){
            return new ChefKnife();
        }
        else if(type.equals("steak")){
            return new SteakKnife();
        }
        return null;
    }
}
