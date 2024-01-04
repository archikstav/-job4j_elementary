package ru.job4j.condition;

    public class Point {
        public static double distance(int x1, int y1, int x2, int y2) {
            double first = x2 - x1;
            double second = y2 - y1;
            double three = Math.pow(first, 2);
            double four = Math.pow(second, 2);
            double five = three + four;
            double six = Math.sqrt(five);
            return six;
        }

        public static void main(String[] args) {
            double result = Point.distance(0, 0, 2, 0);
            double result2 = Point.distance(0, 0, 5, 5);
            double result3 = Point.distance(4, 2, 0, 7);
            double result4 = Point.distance(1, 3, 6, 8);
            System.out.println("result (1, 3) to (6, 8), (0, 0) to (2, 0), (0, 0) to (5, 5), (4, 2) to (0, 7)" + result);

        }
}
