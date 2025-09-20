interface image{
    public void display();
}

class RealImage implements image{
    public String filename;

    private void loadfromfile(String filename){
        System.out.println("Loading from disk "+filename);
    }

    public RealImage(String filename){
        this.filename=filename;
        loadfromfile(filename);
        // initialize ba constructor call hobar por e load hbe file theke    
    }

    public void display(){
        System.out.println("Displaying "+filename);
    }
}

class ProxyImage implements image{
    public String filename;
    public RealImage obj_realimage;
      // sibling's object as a data method        

    public ProxyImage(String filename){
        this.filename=filename;
    }

    public void display(){
        // nijer display te sibling er display use korbo + sibling    initialize na hole age initialize kore nibo  
        
        


        if(obj_realimage==null){
            obj_realimage=new RealImage(filename);
        }
        System.out.println("From ram ");
        obj_realimage.display();
    }

}



public class Proxy{
    public static void main(String[] args) {
        ProxyImage obj_proxy_image=new ProxyImage("a.txt");
        obj_proxy_image.display();
        System.out.println("");
        obj_proxy_image.display();
// sibling er diplay use kora mane analogy : ram er data use korbo ther than SSD     
    }
}