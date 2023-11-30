public class Calculator {

//makeSum(double,double)
  double makeSum(double num1, double num2){

        double sum = num1+num2;

        return sum;

  }
    double makeSum(double num1, double num2, double num3){

        double sum = num1+num2 + num3;

        return sum;

    }



  //Method overloading: methods in one class with the same name
    //but a differen parameter (arguement) list

  double makeSum(double... numbers){

      double sum = 0;
      for(double num:numbers){
        sum+=num;
      }

        return sum;
  }


  double multiply(double num1, double num2){
      return num1*num2;
  }



}
