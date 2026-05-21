package homework21;

import homework21.Transformer.Autobot;
import homework21.Transformer.Decepticon;

import static homework21.data.TransformType.*;

public class TransformerApp {
    public static void main(String[] args) {
        Autobot autobot = createAutobot();
        Decepticon decepticon = createDecepticon();

        runAutobotScenario(autobot);
        System.out.println();
        runDecepticonScenario(decepticon);
    }

    public static Autobot createAutobot() {
        return new Autobot("Bumblebee", "Autobots");
    }

    public static Decepticon createDecepticon() {
        return new Decepticon("Megatron", "Decepticons");
    }

    public static void runAutobotScenario(Autobot autobot) {
        System.out.println("\t\tAutobot");
        autobot.run();
        autobot.fire();
        autobot.charge();
        autobot.transform(VEHICLE);
    }

    public static void runDecepticonScenario(Decepticon decepticon) {
        System.out.println("\t\tDecepticon");
        decepticon.run();
        decepticon.fire();
        decepticon.charge();
        decepticon.transform(GROUND);
    }
}