public class Box {

    double width;
    double height;
    double depth;

    public Box(double weidth, double height, double depth) {
        this.width = weidth;
        this.height = height;
        this.depth = depth;
    }

    public Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    public Box(double len){
        width = height = depth = len;
    }
    public Box(Box obj){
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
    }

    //Return volume
    double volume(){
        return width * height * depth;
    }
}
