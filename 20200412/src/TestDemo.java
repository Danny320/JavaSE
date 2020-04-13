import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TestDemo {

    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tar = sc.nextInt();
        int ret = jumpFloor(tar);
        System.out.println(ret);

    }
    public static int jumpFloor(int target){
        if(target == 1){
            return 1;
        }else if(target == 2){
            return 2;
        }else{
            return jumpFloor(target-1)+jumpFloor(target-2);
        }
    }


    public static void hanoi(int n,char pos1,char pos2,char pos3){
        if(n == 1){
            move(pos1,pos3);
        }else{
            hanoi(n-1,pos1,pos3,pos2);
            move(pos1,pos3);
            hanoi(n-1,pos2,pos1,pos3);
        }
    }
    public static void move(char pos1,char pos2) {
        System.out.print(pos1+"->"+pos2+" ");
    }
    public static void main(String[] args) {
    hanoi(3,'A','B','C');
    }
}



