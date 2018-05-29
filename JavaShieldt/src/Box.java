public class Box {

    double weidth;
    double height;
    double depth;

    public Box(double weidth, double height, double depth) {
        this.weidth = weidth;
        this.height = height;
        this.depth = depth;
    }

    //Return volume
    double volume(){
        return weidth * height * depth;
    }
}
