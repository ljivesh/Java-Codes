class Lab21 {

 private static String name = "Menma";

   public static class Validator {

      public void testMethod() {
         System.out.println("This is a message from nested static class to " + name);
      }
   }

	public static void main(String args[]) {
		
		System.out.println("Jivesh Lakhani 047");
		
      	Lab21.Validator nested = new Validator();
      	nested.testMethod();
   	}
}


