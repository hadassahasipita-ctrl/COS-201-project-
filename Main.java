public class Main {
    static float gravity = 9.8f;

    public static void main(String[] args) {
        System.out.println("Hello world!");

        float pe = potentialEnergy(56.0f, 5f);
        System.out.println("Potential Energy: " + pe);

        Main main = new Main();
    }

    static float potentialEnergy(float mass, float height) {
        return mass * height * gravity;
    }
}



