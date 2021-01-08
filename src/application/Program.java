package application;

public class Program {
    public static void main(String[] args) {
        msg("------- PROGRAM STARTED -------",true);

        startProgram();


        msg("------- PROGRAM ENDED -------",true);

    }


    public static void startProgram(){



    }

    public static void msg(String msg,boolean quebraLinha){
        if ((quebraLinha)) {
            System.out.println(msg);
        } else {
            System.out.print(msg);
        }
    }
}
