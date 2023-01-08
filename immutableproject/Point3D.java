package gr.aueb.cf.ch11.immutableproject;

public final class Point3D {
    //twra thewrw oti einai immutable alla den einai
    private final Point point;
    //to idio to point einai mutable, ara borei o client na to alla3ei
    private final int z;

    public Point3D() {
        point = new Point();
        z = 0;
    }

    public Point3D(Point point, int z) {
        this.point = new Point(point.getX(), point.getY());
        //etsi dhmiourgw deep copy
        this.z = z;
    }

    public Point getPoint() {
        return new Point(this.point.getX(), this.point.getY());
        //epistrefei kai edw ena copy, oxi thn idia thn anafora
    }

    public int getZ() {
        return z;
    }
}
