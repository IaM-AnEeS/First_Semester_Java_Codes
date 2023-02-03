public class Binary_Search {
        public static void main(String[] args) {
            int list[] = { 2, 4, 7, 10 ,11, 40 ,50, 59, 60, 64, 69, 70, 79};;
            int key = 60;

            int Binaryindex = binarySearch(list,key);
            System.out.println("The binary num is " +Binaryindex);
        }
        public static int  binarySearch(int[] list,int key){
            int low = 0;
            int high = list.length - 1;
            while(low<=high){
                int mid = (low+high)/2;
                if(key == list[mid])
                    return mid;
                else if (key > list[mid])
                    low = mid + 1;
                else
                    high = mid -1;
            }
            return -1;
        }
    }


