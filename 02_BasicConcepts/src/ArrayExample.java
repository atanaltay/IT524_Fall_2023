public class ArrayExample {

    public static void main(String[] args) {

        int[] numbers = new int[5];

        numbers[0] = 3;
        numbers[1]= 2;

        System.out.println(numbers.length);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        //primitive type default values  -> all numerics 0 or 0.0
        //boolean -> false
        //refrence -> null

        //String[] teams = new String[10];

        System.out.println("--------------------");

        String[] teams = {"ROMA","BARCELONA",
                "MILAN","GS","MANCHESTER","REAL"};


        for (int i = 0; i < teams.length; i++) {

            System.out.println(teams[i]);

        }
        System.out.println("-----------------------");
        //foreach - enhanced for loop

        for(String team:teams){
            System.out.println(team);
        }

        //multi dimension arrays
        /*
        String[][] data = new String[10][];
        data[0] = new String[]{"val1","val2"};
        data[1] = new String[]{"val1","val2","val3"};
        */

        String[][] products = new String[][]{{"laptop","1000","100"},
                {"mouse","10","1000"},
                {"keyboard","20","1000"}

        };
        System.out.println("--------------------------");

        for (int i = 0; i < products.length; i++) {
            System.out.println("Product " + i + ":");

            for (int j = 0; j < products[i].length; j++) {

                System.out.print("\t" +  products[i][j] + "\n");
            }
        }

        System.out.println("----------------------");
        for(String[] features: products){
            System.out.printf("Name: %s , Price:%s, Amount:%s\n",
                    features[0],features[1],features[2]);

        }

          //We cannot extend the size of arrays
        //System.out.println(products[5]);
        System.out.println("---------------------");
        int [][] nums2d = new int[3][];
        nums2d[0] = new int[]{1,2,3};
        nums2d[1] = new int[]{1,2};
        nums2d[2] = new int[]{1,2,3,4,5,6,7};

        for (int[] nums:nums2d) {
            for(int num: nums){
                System.out.println(num);
            }

        }


    }




}
