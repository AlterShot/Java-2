package Java2;

public class RunYou {

    public String name;
    public String race;
    public int maxDistance;
    public double jumpHeight;
    final static int distance = 2000;
    final static double wall = 0.8;


    public RunYou (String name, String race){
        this.name = name;
        this.race = race;
    }


    public void getReady(){
        if(race == "cat"){
            maxDistance = 300;
            jumpHeight = 2.5;
        }
        if(race == "human"){
            maxDistance = 2000;
            jumpHeight = 0.7;
        }
        if(race == "robot"){
            maxDistance = 10000;
            jumpHeight = 100;
        }
    }


    public void doTheJump() {
        if (jumpHeight < wall) {
            System.out.println(name + " can't do this jump");
        } else {
            System.out.println(name + " jumped over " + wall + " m tall wall.");
        }
    }

    public void doTheRun() {
        if (distance > maxDistance) {
            System.out.println(name + " can't run so far");
        } else {
            System.out.println(name + " ran " + distance + " m distance.");
        }
    }

    public static void announcement() {
        System.out.println("The " + distance + " m long road and the " + wall + "m high wall are in front of competitors.");
    }

    public void marathon() {
        getReady();
        ability();
        doTheRun();
        doTheJump();
    }

    public void ability() {
            System.out.println(name + " can run " + maxDistance + " meters and jump " + jumpHeight + " meters up");
    }

    public static void main(String[] args) {

        RunYou[] tournament = new RunYou[3];
        tournament[0] = new RunYou("Bob", "human");
        tournament[1] = new RunYou("Series002", "robot");
        tournament[2] = new RunYou("Furball", "cat");


        announcement();
        for(int i = 0; i <tournament.length; i++){
            tournament[i].marathon();
        }
    }
}
