public class CircleCalculator {
    public static void main(String[] args) {
        // Check if the radius is provided as an argument
        if (args.length < 1) {
            System.out.println("Please provide the radius.");
            return;
        }

        // Parse the radius from the command line argument
        double radius;
        try {
            radius = Double.parseDouble(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a numeric value for the radius.");
            return;
        }

        // Calculating area and perimeter
        double area = Math.PI * Math.pow(radius, 2);
        double perimeter = 2 * Math.PI * radius;

        // Output: Area and perimeter
        System.out.printf("Area of the circle: %.2f\n", area);
        System.out.printf("Perimeter (Circumference) of the circle: %.2f\n", perimeter);
    }
}
