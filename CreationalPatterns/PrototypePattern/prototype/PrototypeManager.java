package PrototypePattern.prototype;

import java.util.HashMap;
import java.util.Map;

import PrototypePattern.entity.GraphicElement;

public class PrototypeManager {
    private Map<String, GraphicElement> prototypes;

    public PrototypeManager() {
        prototypes = new HashMap<>();
    }

    public void registerPrototype(String key, GraphicElement prototype) {
        prototypes.put(key, prototype);
    }

    public GraphicElement clonePrototype(String key) {
        GraphicElement prototype = prototypes.get(key);
        if (prototype != null) {
            return prototype.clone();
        }
        return null;
    }
}
