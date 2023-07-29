package BusReservation;

public class Bus {
    private int busNo;
    private boolean ac;
    private int capacity;

    Bus(int busNumber, boolean type, int totalCapacity){
        busNo = busNumber;
        ac = type;
        capacity = totalCapacity;
    }

    public int getBusNo(){
        return busNo;
    }
    public void setBusNo(int busNumber){
        busNo = busNumber;
    }

    public void displayBusInfo(){
        System.out.println("Bus Number : "+ busNo +" Ac : "+ ac +" Capacity : "+ capacity);
    }

}
