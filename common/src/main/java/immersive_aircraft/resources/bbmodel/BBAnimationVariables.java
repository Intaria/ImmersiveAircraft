package immersive_aircraft.resources.bbmodel;

import org.mariuszgromada.math.mxparser.Argument;

import java.util.HashMap;
import java.util.Map;

public class BBAnimationVariables {
    public static Map<String, Argument> REGISTRY = new HashMap<>();

    public static void register(String name) {
        REGISTRY.put(name, new Argument("variable_" + name, 0));
    }

    static {
        register("time");
        register("engine_rotation");
        register("pressing_interpolated_x");
        register("pressing_interpolated_y");
        register("pressing_interpolated_z");
        register("yaw");
        register("pitch");
        register("roll");
    }

    public static Argument[] getArgumentArray() {
        return REGISTRY.values().toArray(new Argument[0]);
    }

    public static void set(String name, float value) {
        REGISTRY.get(name).setArgumentValue(value);
    }
}
