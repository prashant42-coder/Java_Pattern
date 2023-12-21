import java.util.*;
public class Righthalf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int s = sc.nextInt();
        System.out.println(s);
        for(int i=1;i<=s;i++){
            for(int j =1;j<s-i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }


}
// output:-
//
//        *
//        **
//        ***
//        ****
//        *****
//in j <s-i
//then we get
//        ****
//        ***
//        **
//        *