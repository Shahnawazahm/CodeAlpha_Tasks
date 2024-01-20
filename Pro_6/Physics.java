package Pro_6;

import java.util.List;

public class Physics {
    public void simulate(List<GameObject> objects) {
        System.out.println("Simulating physics in the 3D scene...");

        for (GameObject object : objects) {
            // Simulate physics logic (e.g., apply gravity)
            object.position.y -= 0.1; // Simple gravity simulation
        }
    }
}
