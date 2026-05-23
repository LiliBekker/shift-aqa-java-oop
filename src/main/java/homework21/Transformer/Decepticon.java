package homework21.Transformer;

import homework21.Action.Action;
import homework21.data.TransformType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class Decepticon extends Transformer implements Action {

    private String teamName;
    private boolean kindness = false;

    private final String eyeColor = "Red";

    public Decepticon(String name, String teamName) {
        super(name);
        this.teamName = teamName;
    }

    @Override
    public void transform(TransformType type) {
        String name = getName();
        switch (type) {
            case GROUND -> System.out.println(name + " transforms into ground transport");
            case AIR -> System.out.println(name + " transforms into air transport");
            case WEAPON -> System.out.println(name + " transforms into weapon");
            case MACHINE -> System.out.println(name + " transforms into machinery");
        }
    }

    @Override
    public void fire() {
        System.out.println(getName() + " is firing");
    }

    @Override
    public void charge() {
        System.out.println(getName() + " is charging");
    }
}