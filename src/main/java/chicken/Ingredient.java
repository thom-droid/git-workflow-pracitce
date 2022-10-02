package chicken;

import java.util.List;

public class Ingredient {

    private String name;

    private boolean isAllergic;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAllergic() {
        return isAllergic;
    }

    public void setAllergic(boolean allergic) {
        isAllergic = allergic;
    }
}
