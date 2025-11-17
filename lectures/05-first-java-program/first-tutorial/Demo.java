public class Demo {
    public static void main(String[] args) {
        System.out.println(args[1]); // command line arguments that you will give while running in terminal like java Demo 30 50 then args -> ["30","50"]
    } // all commands that you write in terminal like javac or java or python3 are executable files in system the command javac basically do double click on javac file u can see location of javac while by terminal command where javac
} // environment variable path is the path for any commands executable file so we give command to terminal then it knows it's executsble file location through environment variable path

// check echo $PATH command later
// google about path variable later

// System view by ctrl+click you see implementation it has a variable out in it which is of type PrintStream and println is a method of out by default it outputs on terminal if you want to change it to output on a .txt file suppose then you can do that as well
// why the main file name class is public and main is public inside it because it's java entry point to start program you have to keep it public 

