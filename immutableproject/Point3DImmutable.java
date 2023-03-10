package gr.aueb.cf.ch11.immutableproject;

public class Point3DImmutable {
    //edw den xreiazetai na kanw kati allo giati pairnw immutable
    private final ImmutablePoint point;
    private final int z;

    public Point3DImmutable() {
        point = new ImmutablePoint();
        z = 0;
    }

    public Point3DImmutable(ImmutablePoint point, int z) {
        this.point = point;
        this.z = z;
    }

    public ImmutablePoint getPoint() {
        return point;
    }

    public int getZ() {
        return z;
    }
}
