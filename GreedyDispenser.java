import java.util.Scanner;
public class GreedyDispenser {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("total withdrawal amount :");
    
    int totalwithdrawal = sc.nextInt();

    
    //500 note 
int notes500 = totalwithdrawal/500;
totalwithdrawal = totalwithdrawal % 500;

int notes200 = totalwithdrawal/200 ;
totalwithdrawal = totalwithdrawal % 200;

int notes100 = totalwithdrawal/100;
totalwithdrawal = totalwithdrawal % 100;




    System.out.println("\n================");
    System.out.println("AMOUNT:"+ totalwithdrawal);
    System.out.println("500Notes :" + notes500);
    System.out.println("200Notes:"+ notes200);
    System.out.println("100 Notes:"+ notes100);
    System.out.println("====================");
    sc.close();

    }
    
}
