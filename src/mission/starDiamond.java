package mission;

public class starDiamond {
    public static void main(String[] args) {

        int size = 3;

        for(int row = 1; row <= size; row++) {
            for(int blank = size-row; blank >= 1; blank--){
                System.out.print(' ');
            }
            for (int col = 1; col <= 2 * row; col++) {
                System.out.print('*');
            }
            System.out.println();
        }
        for(int row = size-1; row >= 1; row--){
            for(int blank = 1; blank <= size-row; blank++){
                System.out.print(' ');
            }
            for(int col = 1; col <=2 * row; col++){
                System.out.print('*');
            }

            System.out.println();
        }
    }
}
