package it.develhope.forloop;
import java.util.Arrays;
public class Start
{
    public static void main(String[] args) {
        String[] array = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] = array[i].toUpperCase();
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

