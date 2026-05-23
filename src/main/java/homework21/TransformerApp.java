package homework21;

import homework21.Action.Action;
import homework21.Transformer.Autobot;
import homework21.Transformer.Decepticon;
import homework21.Transformer.Transformer;
import homework21.data.TransformType;

import java.util.List;

import static homework21.data.TransformType.*;

public class TransformerApp {
    public static void main(String[] args) {
        Autobot autobot = new Autobot("Bumblebee", "Autobots");
        Decepticon decepticon = new Decepticon("Megatron", "Decepticons");

        runScenario(autobot, VEHICLE);
        System.out.println();
        runScenario(decepticon, GROUND);

        List<Transformer> transformers = List.of(autobot, decepticon);
        getAllTransformer(transformers);
    }

    public static void runScenario(Transformer transformer, TransformType type) {
        System.out.println("\t\t" + transformer.getClass().getSimpleName());
        Action action = (Action) transformer;
        action.run();
        action.fire();
        action.charge();
        transformer.transform(type);
    }

    public static void getAllTransformer(List<Transformer> transformers) {
        System.out.println("\n\tСписок трансформеров");
        for (Transformer transformer : transformers) {
            System.out.println("Имя: " + transformer.getName() + " | Тип: " + transformer.getClass().getSimpleName());
        }
    }
}