package author;

import author.model.UserType;

public class StringFormatExample {

    public static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) {

        String name = "petros";

        String name1 = new String("petros");

        String name2 = "petros";




        int age = 34;
        String surname = "dsfghjhgfd";

        UserType userType = UserType.ADMIN;

        String message = String.format("hi %s %s your age is %d", name, surname, age);

        System.out.println(message);

        Integer a = new Integer(1024);

        int b = a;
    }
}
