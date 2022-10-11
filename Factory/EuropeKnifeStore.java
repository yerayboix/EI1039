package Factory;

import Factory.EuropeChefKnife;

public class EuropeKnifeStore extends KnifeStore {
    @Override
    protected Knife createKnife(String type) {
        if (type.equals("chef")){
            return new EuropeChefKnife();
        }
        else if(type.equals("steak")){
            return new EuropeSteakKnife();
        }
        return null;
    }
}
