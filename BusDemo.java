package BusReservation;

import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {
    public static void main(String[] args) {

        ArrayList<Bus> buses = new ArrayList<Bus>();
        buses.add(new Bus(1, true, 21));
        buses.add(new Bus(2, false, 35));
        buses.add(new Bus(3, true, 27));

        for(Bus b: buses){
            b.displayBusInfo();
        }

        Scanner input = new Scanner(System.in);
        int dummy = 1;
        while(dummy==1){
            System.out.println("Enter 0 to Exit or 1 to Continue");
            dummy = input.nextInt();
            if (dummy == 1){
                System.out.println("Mission Success");
            }
        }


    }
}
