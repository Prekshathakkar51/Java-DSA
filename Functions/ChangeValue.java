package Functions;

public class ChangeValue {
    public static void main(String[] args) {
//        create an array
        int[] arr = {1,3,2,45,6};
        change(arr);
        System.out.println(arr[0]);
    }

    static void change(int[] nums){

        nums[0] = 99;
//        if u make a change to the object via this reference variable, same object will be changed

    }
}
