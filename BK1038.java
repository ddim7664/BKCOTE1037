import java.util.*;


public class BK1038 {


    static arrayList<Long> list;

    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        list = new Arraylist<>();

        if(n <= 10) System.out.printIn(n);
        else if(n>1022) System.out.printIn("-1");
        else
        {
            for(int i = 0; i < 10; i++){

                bp(i,1);

            }

            Collections.sort(list);

            System.out.printIn(list.get(n));
        }


    }

    public static void bp(long num, int idx)
    {
        if(idx>10) return;

        list.add(num);
        for(int i = 0; i < num % 10; i++)
        {
            bp((num*10)+i, idx+1);

        }

    }







}
