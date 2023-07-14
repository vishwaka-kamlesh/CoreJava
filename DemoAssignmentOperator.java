// WRITE A JAVA PROGRAM TO DEMO ASSIGNMENT OPERATOR?

class DemoAssignmentOperator {
    
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 5;

        System.out.println("Original values:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Assignment operators
        num1 += num2;
        System.out.println("num1 += num2: " + num1);

        num1 -= num2;
        System.out.println("num1 -= num2: " + num1);

        num1 *= num2;
        System.out.println("num1 *= num2: " + num1);

        num1 /= num2;
        System.out.println("num1 /= num2: " + num1);

        num1 %= num2;
        System.out.println("num1 %= num2: " + num1);
    }
}
