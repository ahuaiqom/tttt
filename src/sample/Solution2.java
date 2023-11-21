import java.util.Scanner;
import java.lang.Math;


public class Solution2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int AngleElevation = scan.nextInt();
        double angleRadians = Math.toRadians(AngleElevation);

        int Speed = scan.nextInt();

        int BuildingHeight = 50;

        double HorizontalDistance = BuildingHeight * Math.tan(angleRadians);
        int Distance = (int) Math.ceil(HorizontalDistance);
        int ParticipantMaxDistance = (int) Math.ceil(6 * Speed / 36 * 10);

        System.out.println("Horizontal distance of the ball to the building: " + Distance + " meters");
        System.out.println("Participants can catch the ball: " + (ParticipantMaxDistance > HorizontalDistance));
    }
}
