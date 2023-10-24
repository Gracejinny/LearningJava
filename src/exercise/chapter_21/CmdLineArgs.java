package exercise.chapter_21;

public class CmdLineArgs {
    public static void main(String[] args) {
        // args
        System.out.println(args.length);

        System.out.printf("첫번째 인자는 :%s\n", args[0]);
        System.out.printf("두번째 인자는 :%s\n", args[1]);
    }
}
