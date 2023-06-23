class Lab6a {
    public static void main(String args[]) {
        int n1=0, n2=1;

        int temp;
        System.out.println(n1);
        System.out.println(n2);
        for(int i=0; i<10; i++) {
            System.out.println(n1+n2);
            temp = n2;
            n2 = n1+n2;
            n1 = temp;
        }

    }
}