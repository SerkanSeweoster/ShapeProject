package Resources;

public class ShapeDrawer {
    public static void drawSquare(int size) {
        String[][] square = new String[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    square[i][j] = "* ";
                } else {
                    square[i][j] = "  ";
                }
            }
        }
        drawShape(square);
    }

    public static void drawRectangle(int width, int height) {
        String[][] rectangle = new String[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                    rectangle[i][j] = "* ";
                } else {
                    rectangle[i][j] = "  ";
                }
            }
        }
        drawShape(rectangle);
    }

    public static void drawCircle(int radius) {
        int diameter = 2 * radius;
        for (int i = 0; i <= diameter; i++) {
            for (int j = 0; j <= diameter; j++) {
                int distance = (i - radius) * (i - radius) + (j - radius) * (j - radius);
                if (distance > (radius - 0.5) * (radius - 0.5) && distance < (radius + 0.5) * (radius + 0.5)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public static void drawTriangle(int size) {
            String[][] triangle = new String[size][2 * size - 1];
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < 2 * size - 1; j++) {
                    if (j >= size - 1 - i && j <= size - 1 + i) {
                        triangle[i][j] = "* ";
                    } else {
                        triangle[i][j] = "  ";
                    }
                }
            }
            drawShape(triangle);
    }

    public static void drawShape(String[][] shape) {
        for (String[] row : shape) {
            for (String symbol : row) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
