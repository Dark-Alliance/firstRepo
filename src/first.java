//Program to show Scanner class work

import java.util.Scanner;

public class first {
    int n=1;
    public  void main(String[] args) {
        odd();

    }

    void odd(){
        if(n<=10){
            System.out.println(n+1);
            n++;
            even();
        }
        return;
    }

         void even(){
        if(n<=10){
            System.out.println(n+1);
            n++;
            odd();
        }
        return;
    }
}

