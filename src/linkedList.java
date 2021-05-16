import java.util.LinkedList;
import java.util.Scanner;

public class linkedList {

    public static void main(String[] agrs){
        LinkedList orderlist = new LinkedList();

        System.out.print("Enter your order here: ");
        Scanner inputOrder = new Scanner(System.in);
        String order = inputOrder.nextLine();

        if(order.isEmpty()){
            System.out.println("Blank order");
        }

        else{
            orderlist.add(order);
        }

        





    }
}
