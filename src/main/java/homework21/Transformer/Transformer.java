package homework21.Transformer;

import homework21.data.TransformType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public abstract class Transformer {

    private String name;

    public abstract void transform(TransformType type);
}