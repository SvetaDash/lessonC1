public class Partaker {
    String name;
    int runDistance;
    boolean isFinished;

    public Partaker (String name, int runDistance){
        this.name = name;
        this.runDistance = runDistance;
    }

    public void info(){
        System.out.println(name +" "+ runDistance + " "+ isFinished);
       }
}
