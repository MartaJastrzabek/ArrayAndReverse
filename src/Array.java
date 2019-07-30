import java.util.Random;

public class Array {
    public static void main(String[] args) {
       int[] numbers = generateNumbers();
       printArrayAndReverse(numbers);

    }

    private static int[] generateNumbers(){
        int[] array = new int[10];
        Random random = new Random();
        for(int i = 0; i<array.length; i++){
            array[i] = random.nextInt(100);
        }
        return array;
    }
    private static void printArrayAndReverse(int[] array){
        int reverseCounter = (array.length*2) - 1;
        for(int i = 0; i<=reverseCounter ; i++){
            if(i<array.length){
                System.out.print(array[i] + " ");
            }else {
                System.out.print(array[reverseCounter-i] + " ");
            }
        }
    }

}
