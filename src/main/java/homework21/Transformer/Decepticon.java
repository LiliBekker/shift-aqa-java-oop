package homework21.Transformer;

import homework21.data.TransformType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class Decepticon extends Transformer {

    private String teamName;
    private boolean kindness = false;

    private final String eyeColor = "Red";

    public Decepticon(String name, String teamName) {
        super(name);
        this.teamName = teamName;
    }

    public void transform(TransformType type) {

        String name = getName();

        switch (type) {
            case GROUND:
                System.out.println(name + " transforms into ground transport");
                break;

            case AIR:
                System.out.println(name + " transforms into air transport");
                break;

            case WEAPON:
                System.out.println(name + " transforms into weapon");
                break;

            case MACHINE:
                System.out.println(name + " transforms into machinery");
                break;
        }
    }
}