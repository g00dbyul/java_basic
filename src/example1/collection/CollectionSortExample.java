package example1.collection;

import java.util.ArrayList;
import java.util.List;

class Point {
    int x;
    int y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class CollectionSortExample {
    public static void main(String[] args) {
        List<Point> points = new ArrayList<>();
        points.add(new Point(3, 4));
        points.add(new Point(1, 2));
        points.add(new Point(5, 1));
        points.add(new Point(3, 1));


        points.sort((Point p1, Point p2) -> Integer.compare(p2.y, p1.y));

        for (Point p : points) {
            System.out.println(p.x + ", " + p.y);
        }

        points.sort((Point p1, Point p2) -> {
            if (p2.y != p1.y) {
                return Integer.compare(p2.y, p1.y);
            } else {
                return Integer.compare(p1.x, p2.x);
            }
        });

        System.out.println("==============");
        for (Point p : points) {
            System.out.println(p.x + ", " + p.y);
        }
    }
}
