package Lab_Studies.Lab04.Run;

public class RoadRunner implements Run, Run_Faster{
    public String run() {
        return "Roadrunner is running, meep meep!";
    }

    public String run_faster() {
        return "Roadrunner is running faster, meep meep!";
    }
}
