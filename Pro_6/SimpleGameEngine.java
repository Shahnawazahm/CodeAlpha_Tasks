package Pro_6;

import java.util.ArrayList;
import java.util.List;

// SimpleGameEngine.java
public class SimpleGameEngine {
    public static void main(String[] args) {
        // Create a 3D scene
        Scene scene = new Scene();

        // Create some 3D objects
        GameObject object1 = new GameObject(new Vector3D(0, 0, 0));
        GameObject object2 = new GameObject(new Vector3D(1, 1, 1));

        // Add objects to the scene
        scene.addObject(object1);
        scene.addObject(object2);

        // Main game loop
        for (int i = 0; i < 100; i++) {
            // Update the 3D scene
            scene.update();
        }
    }
}
	
