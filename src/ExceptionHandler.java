public class ExceptionHandler {
    public static void unknownException() {
        System.out.println("Unkown Error Occurred.");
    }
    public static void handleException(Exception e) {
    	System.out.println(e);
    }
}