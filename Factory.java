interface Shape {
    public void draw();
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}



class ShapeFactory {




// [This is the main thing about factory design patter, that the factory class
//  have a method that return specific objects here the      creation control
//  is on our hand .. Factory design pattern will be useful for latter Flyweight pattern ]                                                                       


    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }

        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();

        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }

        return null;
    }
}

public class Factory {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("CIRCLE");


// Baper instance e polar object dibo = run time polymorphism advantage:  oi instance function ke call korle specific child er specific function call hbe                                                        



        if (shape1 != null) {
            shape1.draw();
        }
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        if (shape2 != null) {
            shape2.draw();
        }
    }
}