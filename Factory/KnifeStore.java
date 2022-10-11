package Factory;

import Factory.Knife;

public abstract class KnifeStore {

    public Knife orderKnife(String type){
        Knife knife = null;

        knife = createKnife(type);

        knife.sharpen();
        knife.polish();
        knife.wrapp();

        return knife;
    }

    protected abstract Knife createKnife(String type);
}
