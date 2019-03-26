import java.util.Stack;

public class ReverseInt {
    public static class Person {
        private String name;
        private int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        /**
         * @return the age
         */
        public int getAge() {
            return age;
        }

        /**
         * @return the name
         */
        public String getName() {
            return name;
        }

        /**
         * @param age the age to set
         */
        public void setAge(int age) {
            this.age = age;
        }

        /**
         * @param name the name to set
         */
        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        // System.out.println(Integer.MAX_VALUE);
        // int x = 2147483647;
        // System.out.println("Before addition " + x);
        // x += 1;
        // System.out.println("After " + x);
        // Person person1 = new Person("Mary", 20);
        // System.out.println(person1);
        // Stack<Integer> test = new Stack<>();
        // test.push(1);
        // test.push(2);
        // System.out.println(test.peek());
        System.out.println(10234 % 4);
    }
}