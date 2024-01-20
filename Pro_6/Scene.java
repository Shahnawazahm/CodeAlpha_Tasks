package Pro_6;

import java.util.ArrayList;
import java.util.List;

// Scene.java
public class Scene {
    List<GameObject> objects = new ArrayList<>();
    Renderer renderer = new Renderer();
    Physics physics = new Physics();

    public void addObject(GameObject object) {
        objects.add(object);
    }

    public void update() {
        // Implement the main update loop for the 3D scene
        physics.simulate(objects);
        renderer.render(objects);
    }
}
