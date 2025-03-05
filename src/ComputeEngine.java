import project.annotations.ConceptualAPIPrototype;
//create another class that will implement interface
public class ComputeEngine {

    @ConceptualAPIPrototype
    public static void computation(Interface1 interface1) {
        int x = 3;
        interface1.computeDouble(x);
    }

  


}
//Consolidate this class with the ComputeEngine class, it seems redundant to have two classes that
//do the same thing. Talk to Professor at office hours. 