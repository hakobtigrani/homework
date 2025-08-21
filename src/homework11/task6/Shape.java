package homework11.task6;

public enum Shape implements Drawable{
    CIRCLE {
        @Override
        public void draw() {
            System.out.println("Drawing a circle: (in fact nothing cz idk how to do it)");
        }
    },
    SQUARE {
        @Override
        public void draw() {
            System.out.println("Drawing a square: (in fact nothing cz idk how to do it)");
        }
    },
    TRIANGLE {
        @Override
        public void draw() {
            System.out.println("Drawing a triangle: (in fact nothing cz idk how to do it)");
        }
    };
}
