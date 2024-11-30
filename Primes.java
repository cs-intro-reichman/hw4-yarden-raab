public class Primes {
    public static void main(String[] args) {
        int length = Integer.parseInt(args[0]);
        boolean arr [] = new boolean [length + 1];
        arr[0]= false;
        arr[1] = false;
        int count =0;
        for (int i=2; i<arr.length; i++) {
            arr[i] = true;
        }
        for (int i=2; i<arr.length; i++) {
            if (arr[i] == true) {
                mult(i, arr);
            }
        }
        System.out.println("Prime numbers up to " + length + ":");
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == true) {
                System.out.println(i);
                count++;
            }
        }
        int present = (int) ((double) count / length*100);
        System.out.println("There are " + count + " primes between 2 and " + length +
                           " (" + present + "% are primes)");
    }





    public static boolean [] mult (int num, boolean [] arr) {
        int start = num +1;
        for (int i= start; i<arr.length; i++) {
            if (i % num == 0) {
                arr[i] = false;
            }
        }
        return arr;
    }
}