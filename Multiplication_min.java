public class Multiplication_min {
        public static void main(String[] args) {
            int[] array = {2, 4, 5, 6, 7, 8, 9, 10, 11, 12};
            multiplyArray(array);
        }
        public static void multiplyArray(int[] array) {
            int min = array[0];
            for(int i=1; i<array.length; i++)
            {
                if(array[i] < min)
                    min = array[i];
            }
            for(int j=0; j<array.length; j++)
            {
                array[j] *= min;
            }
            for(int k=0; k<array.length; k++)
            {
                System.out.print(array[k] + " ");
            }
        }
    }

