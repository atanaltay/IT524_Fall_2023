public class Loops2 {


    public static void main(String[] args) {

        //break and continue

        /*
        int count = 0;

        while(count<100){
            System.out.println("count is " + count);

            count++;

            if(count==50) break;

        }
*/
        System.out.println("----------------");
        System.out.println("----------------");

        int count = 0;
        while(count<100){

          count++;  
            if(count==50){
                continue;
            }


          System.out.println("count is " + count);          


        }

    }


}
