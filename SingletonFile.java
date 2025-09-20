class singleton{
    private static singleton ins=null;
    private singleton(){}
    public static singleton getInstance(){
        if(ins==null){
            ins= new singleton();
        }
        return ins;
    }
}

interface Shape {
void draw();
}

class Circle implements Shape{
    public void draw(){
        System.out.println("Circle");
    }
}

class Rectangle implements Shape{
    public void draw(){
        System.out.println("Rectangle");
    }
}

class ShapeFactory{
    public Shape getShape(String type){
        if(type==null){
            return null;
        }
        else if(type=="Rectangle"){
            return new Rectangle();
        }else if(type=="Circle"){
            return new Circle();
        }

        return null;
    }
}

class SingletonFile{
    public static void main(String[] args) {
        // singleton x=singleton.getInstance();
        // singleton y=singleton.getInstance();

        // System.out.println(x.hashCode());
        // System.out.println(y.hashCode());

        ShapeFactory obj= new ShapeFactory();
        Shape obj1=obj.getShape("Rectangl");
        obj1.draw();
    }
}