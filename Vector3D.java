public class Vector3D {
    double x;
    double y;
    double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public String toString(double x, double y, double z) {
        return String.format("(%.2f, %.2f, %.2f)", x, y, z);
    }

    public double getMagnitude() {
        return Math.abs(Math.sqrt(x * x + y * y + z * z));
    }

    public String normalize() {
        double normalizedX = x / getMagnitude();
        double normalizedY = y / getMagnitude();
        double normalizedZ = z / getMagnitude();

        return toString(normalizedX, normalizedY, normalizedZ);
    }

    public String add(Vector3D v) {
        Vector3D vector = new Vector3D(x + v.x, y + v.y, z + v.z);
        return toString(vector.x, vector.y, vector.z);
    }

    public String multiply(Vector3D v) {
        Vector3D vector = new Vector3D(x * v.x, y * v.y, z * v.z);
        return toString(vector.x, vector.y, vector.z);
    }

    public double dotProduct(Vector3D v) {
        return x * v.x + y * v.y + z * v.z;
    }

    public double angleBetween(Vector3D v) {
        return dotProduct(v) * dotProduct(this) / ((Math.abs(dotProduct(this)) * Math.abs(dotProduct(v))));
    }

    public String crossProduct(Vector3D v) {
        double betweenX = this.y * v.z - this.z * v.y;
        double betweenY = this.z * v.x - this.x * v.z;
        double betweenZ = this.x * v.y - this.y * v.x;

        return toString(betweenX, betweenY, betweenZ);
    }
}
