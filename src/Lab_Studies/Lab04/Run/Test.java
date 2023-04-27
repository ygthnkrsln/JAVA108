package Lab_Studies.Lab04.Run;

public class Test {
    public static void main(String[] args) {
        Hunting j = new Jaguar();
        Run_Faster r = new RoadRunner();

        System.out.println(j.hunt());
        System.out.println(j.run());
        System.out.println(j.run_faster());
        System.out.println(r.run());
        System.out.println(r.run_faster());
    }
}
