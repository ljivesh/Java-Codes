class VariableExample {
    // instance variable
    private int instanceVar;

    // static variable
    private static int staticVar;

    public static void main(String[] args) {
		
	System.out.println("Jivesh Lakhani 047");

        // local variable
        int localVar = 10;

        VariableExample obj1 = new VariableExample();
        VariableExample obj2 = new VariableExample();

        obj1.instanceVar = 5;
        obj2.instanceVar = 10;

        staticVar = 20;

        System.out.println("Local variable: " + localVar);
        System.out.println("Instance variable of obj1: " + obj1.instanceVar);
        System.out.println("Instance variable of obj2: " + obj2.instanceVar);
        System.out.println("Static variable: " + staticVar);
    }
}



