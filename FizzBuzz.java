public class FizzBuzz {
    public static void main(String args[]) {

        printBuzz(100);
    }

    private static void printBuzz(int num) {
        for (int fbzz = 0; fbzz <= num; fbzz++) {
            if (((fbzz % 3) == 0) && ((fbzz % 5) == 0))
                System.out.println(fbzz + ": FizzBuzz");
            else if ((fbzz % 3) == 0)
                System.out.println(fbzz + ": Fizz");
            else if ((fbzz % 5) == 0)
                System.out.println(fbzz + ": Buzz");
            else
                System.out.println(fbzz);

        }
    }
}

  
    


