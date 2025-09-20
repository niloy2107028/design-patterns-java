interface Rail{
    public void vehicleMoving();
}

class car{
    public void move(){
        System.out.println("Car moving");
    }
}

class Adapter implements Rail{
    private car car_obj;
    public Adapter(car car){
        car_obj=car;
    }
    public void vehicleMoving(){
        car_obj.move();
    }

}


public class AdapterFile {
    public static void main(String[] args) {
        car obj_car=new car();
        Adapter obj_adapter=new Adapter(obj_car);
        obj_adapter.vehicleMoving();
    }
    
}