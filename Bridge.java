
/*
 red object , blue obje create korbo
egulo cicrle , rectangle shape object e pathabo
circle, rectangle extends abstract shape class 
so specific message for specific function
shape has a data method type is color object
shape e default constractor rakhbo color initialize korar jonno as shape is a abstract class using super            

circle and rectangle obj diye draw called where there will be a specific message for specific color obj
 */








interface Color {
    public String color_name();
}

class RedColor implements Color {

    public String color_name() {
        return "Red";
    }
}

class BlueColor implements Color {

    public String color_name() {
        return "Blue";
    }
}

abstract class Shape {

    // if it was interface you cant have    data members other than static  and only a abstract class can have abstract method  
    
    

    
    protected Color color_obj;

    public Shape(Color obj) {
        color_obj = obj;
    }

    public abstract void draw();

}

class Circle extends Shape {

    public Circle(Color obj) {
        super(obj);
    }

    public void draw() {
        System.out.println("This is a Circle with color " + color_obj.color_name());
    }
}

class Square extends Shape {

    public Square(Color obj) {
        super(obj);
    }

    public void draw() {
        System.out.println("This is a Square with color " + color_obj.color_name());
    }
}

public class Bridge {

    public static void main(String[] args) {
        RedColor red_obj = new RedColor();
        BlueColor blue_obj = new BlueColor();

        Circle circle_obj = new Circle(red_obj);
        Square square_obj = new Square(blue_obj);

        circle_obj.draw();
        square_obj.draw();

    }

}