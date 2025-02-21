import project.annotations.ConceptualAPIPrototype;

public class ComputeEngine {

    @ConceptualAPIPrototype
    public static void computation(Interface1 interface1) {
        int x = 3;
        interface1.computeDouble(x);
    }

    @ConceptualAPIPrototype
    public static String getStatus() {
        // Empty implementation
        return "";
    }
}
