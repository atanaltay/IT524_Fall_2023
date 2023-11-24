public class Teams {


    public static void main(String[] args) {

        String[] teams = {"Barcelona","Roma","Juventus","Galatasaray","Milan","Liverpool","Manchester"};


        for (int i = 0; i < teams.length; i++) {
            String team1 = teams[i];

            for (int j = i+1; j < teams.length; j++) {
                System.out.println(team1 + "-" + teams[j]);
            }


        }




    }



}
