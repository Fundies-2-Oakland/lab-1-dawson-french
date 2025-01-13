public class Vector3DMain {
    public static void main(String[] args) {
        Vector3D vector1 = new Vector3D(3, 4.2131, 5.231);
        Vector3D vector2 = new Vector3D(4, 5, 6);
        System.out.println(vector1.getX());
        System.out.println(vector1.getY());
        System.out.println(vector1.getZ());
        System.out.println(vector1.toString(vector1.getX(), vector1.getY(), vector1.getZ()));
        System.out.println(vector1.getMagnitude());
        System.out.println(vector1.normalize());
        System.out.println(vector1.add(vector2));
        System.out.println(vector1.multiply(vector2));
        System.out.println(vector1.dotProduct(vector2));
        System.out.println(vector1.angleBetween(vector2));
        System.out.println(vector1.crossProduct(vector2));
    }
}
