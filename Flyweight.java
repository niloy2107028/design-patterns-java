import java.util.HashMap;


//Same color er object 2 bar create korbo naaaa   


interface Shape{
    public void draw();
    //interface ekhane hudai use korse as we are using only one shape 
}

class Circle implements Shape{
    private String color_name;
    public Circle(String color_name){
        this.color_name=color_name;
    }

    public void draw(){
        System.out.println("Drawing a circle with color "+color_name);
    }
}

class ShapeFactory{
    private static final HashMap<String,Shape> color_map=new HashMap<>();
//color is using as a key so same color only one object      

    public static Shape getShape(String color){
        Circle obj_Color=(Circle) color_map.get(color);
        //as we are storing Shape the parent   object we need child object   

        if(obj_Color==null){
            obj_Color=new Circle(color);
            color_map.put(color, obj_Color);
            System.out.println("Creating a new circle with color "+color);
        }else{
            System.out.println("Reterning the already existing circle of color "+color);
        }

        return obj_Color;
    }

}


public class Flyweight {
    public static void main(String[] args) {
        ShapeFactory obj=new ShapeFactory();
        Shape obj1=ShapeFactory.getShape("red");
//         Always use parent instance for children as we are using interface . 
        System.out.println(obj1.hashCode());
        Shape obj2=ShapeFactory.getShape("red");
        System.out.println(obj2.hashCode());
        
        
    }
}
