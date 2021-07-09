import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        System.out.println((arrayLeftShifter(array, 1)));

    }

    public static ArrayList<Integer> arrayLeftShifter(int[] arr, int shift){
        ArrayList<Integer> al1 = new ArrayList<>();
        for(int i = shift; i < arr.length ; i++){
            al1.add(arr[i]);
        }

        ArrayList<Integer> al2 = new ArrayList<>();
        for(int i = 0; i < shift; i++){
            al2.add(arr[i]);
        }
        //al1 + al2
        al1.addAll(al2);

        return al1;
    }
}
