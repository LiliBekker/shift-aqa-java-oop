package homework21.Transformer;

import homework21.data.TransformType;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class Autobot extends Transformer {

    private String teamName;
    private boolean kindness = true;

    private final String eyeColor = "Blue";

    public Autobot(String name, String teamName) {
        super(name);
        this.teamName = teamName;
    }

    public void transform(TransformType type) {
        if (type == TransformType.VEHICLE) {
            System.out.println(getName() + " transforms into ground vehicle");
        }
    }
}