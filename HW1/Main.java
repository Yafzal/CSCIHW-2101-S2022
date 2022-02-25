package HW1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start of Main");
        // Create an object that will make a Pyramid (see Pyramid.java for more info)
        //CLASSNAME name = new CLASSNAME();
        Pyramid py = new Pyramid(); 
        py.Output();
        // Create an object that implements a method which will take an name, age, and favorite color and will return a story (see Adlibs.java for more info)
        Adlibs ay = new Adlibs();
        System.out.println(ay.story("Yousaf", 20, "Blue"));
        Adlibs gr = new Adlibs();
        System.out.println(gr.story("Greg", 25, "black"));
        // Create an object that implements a method which will  accept a string, an integer, and a char and will replace the char in the string at the given integer (See Replace.java for more info)
        Replace ry = new Replace();
        System.out.println(ry.charReplace("I MAKE BREAD",2,'T'));
        System.out.println(ry.charReplace("I LIKE EGGS", 5, 'G'));

    }
}
