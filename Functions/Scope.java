package Functions;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        {
            a = 78;
            int c = 99;
//            values initialized in this block will remain in this block and it wont be used outside the box
//            already initialize  outside this block in the same method , hence you cannot initialize it again
//            but if u change the value , the value will be changed
//            reassign an original ref variable to some other value

//            Scoping in for loop
        }
        int c = 45;

        for (int i = 0; i < 4; i++) {
            System.out.println(i);
        }

//            System.out.println(i);

//        Anything that is initialised inside the block , can be initialised outside the block
//        Anything that is iinitialised outside the block cannnot be initiased inside the block but can be surely updated
//        The scope of the initialised variable inside the block will be within the block itself


        System.out.println(a);


}

    static  void random(){
//        System.out.println(a);
    }
}
