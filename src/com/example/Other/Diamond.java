public class Diamond{


    public Diamond() {
    }

    public static void diamond() {

        for ( int i = 0 ; i < 3 ; i++ ) {
            for ( int j = 0 ; j + i < 2 ; j++ ) {
                System.out.print("□");
            }

            for ( int k = 0 ; k < 0 + i  ; k++ ) {
                System.out.print("■■");
                
            }

            System.out.print("■");
            
            for ( int j = 0 ; j + i < 2 ; j++ ) {
                System.out.print("□");
            }
            System.out.println();
        }




        for( int i = 0 ; i < 2 ; i++ ){
            for ( int j = 0 ; j < 1 + i ; j++ ) {
                System.out.print("□");
            }

            for ( int k = 0 ; k + i < 1  ; k++ ) {
                System.out.print("■■");
            }

            System.out.print("■");

            for ( int j = 0 ; j < 1 + i ; j++ ) {
                System.out.print("□");
            }

            System.out.println();
        }




    }
}