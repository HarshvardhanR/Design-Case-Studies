import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ParkingLevels level;
        Vehicle v;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the ParkingLot");
        System.out.println("What level do you want to choose:");
        System.out.print("Levels available are as follows: ");
        System.out.println("One, Two");
        System.out.println("Choose any one level from above mentioned and input the level as 'one' or 'two'");
        while(true){
            String s = sc.nextLine();
            if(s.equals("one")){
                level = new LevelOne();
                System.out.println("Thank you for choosing level " + s);
                break;
            }
            else if(s.equals("two")){
                level = new LevelTwo();
                System.out.println("Thank you for choosing level " + s);
                break;
            }
            else{
                System.out.println("Please enter the valid level");
            }
        }
        System.out.println("We need your number Plate for the vehicle:");
        String plate = sc.nextLine();
        System.out.println("What kind of vehicle you have. We accomodate Motorcycle, Car and Truck");
        System.out.println("Please enter the input the same as you did for the levels");
        while(true){
            String vT = sc.nextLine();
            if(vT.equals("car")){
                v = new Car(plate);
                break;
            }
            else if(vT.equals("motorcycle")){
                v = new MotorCycle(plate);
                break;
            }
            else if(vT.equals("truck")){
                v = new Truck(plate);
                break;
            }
            else{
                System.out.println("Please enter the valid vehicle type");
            }
        }
        ParkingLot lot = new ParkingLot(level, v);
        System.out.println(lot.availableSpaces());
    }
}
