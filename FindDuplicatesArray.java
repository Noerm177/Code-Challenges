public class FindDuplicatesArray {

    public static void main (String args[]){
        
        String[] arr = {"python", "java", "c#", "java", "python"};
        int IsFound = 0;

        for (int exterior = 0; exterior < arr.length; exterior++ ){
            for (int interior = exterior +1; interior < arr.length; interior++){
                if (arr[exterior] == arr[interior]){
                    System.out.println("\n" + arr[exterior] + ": is duplicated"); 
                    IsFound ++;
                }
            }
        }
        System.out.println("\nDuplicates founded: " + IsFound);
    }
}

