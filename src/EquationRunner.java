import java.util.Scanner;
public class EquationRunner {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the first coordinate point: ");
        String coordA = s.nextLine();

        int comma = coordA.indexOf(",");
        int x = Integer.parseInt(coordA.substring(1, comma));
        int y = Integer.parseInt(coordA.substring(comma + 1, coordA.length() - 1));


        System.out.print("Enter the second coordinate point: ");
        String coordB = s.nextLine();

        int commaB = coordB.indexOf(",");
        int xB = Integer.parseInt(coordB.substring(1, commaB));
        int yB = Integer.parseInt(coordB.substring(commaB + 1, coordB.length() - 1));


        LinearEquation pointA = new LinearEquation(x, y);
        LinearEquation pointB = new LinearEquation(xB, yB);
        LinearEquation point = new LinearEquation(x, y, xB, yB);

        System.out.println("First pair: " + pointA.getCoords() +"\nSecond pair: " + pointB.getCoords());
        System.out.println(point.toString_());

        System.out.print("Enter a third x-value: ");
        double theX = s.nextDouble();
        s.close();
        System.out.println("Solved coordinate point is: " + point.solvingCoordPoint(theX));

    }
}