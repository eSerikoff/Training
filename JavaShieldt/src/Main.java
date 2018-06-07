public class Main {

    public static void main(String[] args) {

        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box();
        Box myBox3 = new Box(7);
        Box myBox4 = new Box(myBox1);
        BoxWeight myBoxW = new BoxWeight(40, 10,11,12);

        double vol;

        vol = myBox1.volume();
        System.out.println("Volume: " + vol);

        vol = myBox2.volume();
        System.out.println("Volume: " + vol);

        vol = myBox3.volume();
        System.out.println("Volume: " + vol);

        vol = myBox4.volume();
        System.out.println("Volume: " + vol);

        vol = myBoxW.volume();
        System.out.println("Volume: " + vol + " and weight: " + myBoxW.weight);


        }
}
