package other.test;



public class Test028 { 
    public void someOuterMethod() {
        new Inner();
    } 
    public class Inner { } 
    
    public static void main(String[] argv) {
        Test028 ot = new Test028(); 
       
    } 
} 