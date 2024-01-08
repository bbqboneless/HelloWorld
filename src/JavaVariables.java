public class JavaVariables {
    //scope = entire class
    static int memberVar = 123;
    //psvm shortcut
    public static void main(String[] args) {
        int twoLine;
        //asignment
        twoLine = 2;
        //sout shortcut
        System.out.println("The result is: " + twoLine);

        //int myVar = getInt();
        //System.out.println("The result is: " + myVar);

        final int f = 10;
        System.out.println(f);

        //global variable
        int global = memberVar + 10;
        System.out.println(global);
    }
    public static int getInt(){
        int scope = 22;
        return scope;
    }
}
