package homework21.Transformer;

import homework21.Action.Action;
import homework21.data.TransformType;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class Autobot extends Transformer implements Action {

    private String teamName;
    private boolean kindness = true;
    private final String eyeColor = "Blue";

    public Autobot(String name, String teamName) {
        super(name);
        this.teamName = teamName;
    }

    @Override
    public void transform(TransformType type) {
        if (type == TransformType.VEHICLE) {
            System.out.println(getName() + " transforms into ground vehicle");
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