public class Main {

    public static void main(String[] args) {

        Box myBox = new Box();

        double vol;

        myBox.weidth = 10;
        myBox.height = 20;
        myBox.depth = 15;

        vol = myBox.depth * myBox.weidth * myBox.height;
        System.out.println("Volume: " + vol);
    }
}
