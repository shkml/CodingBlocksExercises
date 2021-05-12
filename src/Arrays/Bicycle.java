package Arrays;

public class Bicycle extends Animal implements Vehicle  {
    int speed;
    int gear;

    @Override
    public void animalSound(){
        System.out.println("Ok");
    }
    // to change gear
    @Override
    public void changeGear(int newGear){

        gear = newGear;
    }

    public void animalSound2(){
        System.out.println(this.a);
    }

    // to increase speed
    @Override
    public void speedUp(int increment){

        speed = speed + increment;
    }

    // to decrease speed

    public void applyBrakes(int decrement){

        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("speed: " + speed
                + " gear: " + gear);
    }

    public static void main(String[] args) {
        Bicycle b = new Bicycle();
        b.speed = 100;
        b.changeGear(10);
        b.applyBrakes(10);
        // b.a =20;
        System.out.println(b.gear);
        b.animalSound2();
        System.out.println(b.x);
        b.sleep();
    }
}

