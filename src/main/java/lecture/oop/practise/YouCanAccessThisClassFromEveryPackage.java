package lecture.oop.practise;

public class YouCanAccessThisClassFromEveryPackage {
    public static void main(String[] args) {
        YouCanAccessThisClassFromEveryPackage a = new YouCanAccessThisClassFromEveryPackage();
        PrivateClass privateClass = new PrivateClass();
        System.out.println(privateClass.name);
    }
    public YouCanAccessThisClassFromEveryPackage() {
        System.out.println("Hello");
        PrivateClass privateClass = new PrivateClass();
        ProtectedClass protectedClass = new ProtectedClass();
    }


    private static class PrivateClass {

        String name = "EREN";
        PrivateClass() {
            System.out.println("PrivateClass Created");
        }
    }

    protected class ProtectedClass {
        ProtectedClass() {
            System.out.println("ProtectedClass Created");
        }
    }
}
