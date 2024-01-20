package Pro_6;

import java.util.List;

public class Renderer {
    public void render(List<GameObject> objects) {
        System.out.println("Rendering the 3D scene...");

        for (GameObject object : objects) {
            // Simulate rendering logic (e.g., print object position)
            System.out.println("Rendering object at position: " + object.position.x + ", " + object.position.y + ", " + object.position.z);
        }
    }
}
