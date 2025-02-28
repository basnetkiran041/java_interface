public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Circle c=new Circle();
        Rectangle r=new Rectangle();
        Square s=new Square();
        c.draw();
        r.draw();
        s.draw();
    
    }
}
interface Drawable {
    void draw();
}
class Circle implements Drawable {
    public void draw(){
        System.out.println("Drawing Circle");
        System.out.println("Is this also being printed");

    }
}
class Rectangle implements Drawable {
    public void draw(){
        System.out.println("Drawing Rectangle");
    }
} 
class Square implements Drawable {
    public void draw(){
        System.out.println("Drawing Square");
    }
}