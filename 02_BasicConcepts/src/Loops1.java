public class Loops1 {

    public static void main(String[] args) {

        for(int i=0;i<100;i++){

            System.out.printf("i is %d\n",i);

        }

        System.out.println("-----------------");

        int count = 0;
        while(count<100){

            System.out.printf("count is %d\n",count);
            count++;

        }

        System.out.println("-----------------");

        count = 101;

        do{
            System.out.printf("count is %d\n",count);
            count++;

        }while (count<100);








    }

}
