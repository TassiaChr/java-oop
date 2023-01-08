package gr.aueb.cf.ch11.point3project.app;

import gr.aueb.cf.ch11.point3project.model.PointXYZ;

public class PointXYZApp {

    public static void main(String[] args) {
        PointXYZ p1 = new PointXYZ(1, 5, 3);
        PointXYZ p2 = new PointXYZ();

        p2.setX(20);
        p2.setY(25);
        p2.setZ(2);

        System.out.println("p1 is: " + p1.convertToString());
        System.out.println("p2 is: " + p2.convertToString());
    }
}
