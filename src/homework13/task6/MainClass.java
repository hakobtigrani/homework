package homework13.task6;

public class MainClass {

    class LevelOne {

        class LevelTwo {

            class LevelThree{
                void hi() {
                    System.out.println("hi");
                }
            }

        }

    }

    public static void main(String[] args) {

        MainClass mainClass = new MainClass();
        MainClass.LevelOne levelOne = mainClass.new LevelOne();
        MainClass.LevelOne.LevelTwo levelTwo = levelOne.new LevelTwo();
        MainClass.LevelOne.LevelTwo.LevelThree levelThree = levelTwo.new LevelThree();
        levelThree.hi();

    }

}
