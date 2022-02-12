package Activities;

public class Activity8 {

    public static void main(String[] a) throws CustomException {

        Activity8.exceptionTest("Will print to console");
        Activity8.exceptionTest(null);
        Activity8.exceptionTest("Won't execute");
    }

    static void exceptionTest(String str) throws CustomException {
        if(str == null) {
            throw new CustomException("String value is null");
        } else {
            System.out.println(str);
        }
    }
}
