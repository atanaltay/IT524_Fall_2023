public  class AProblematicOne {

    //Checked and unchecked exceptions

    //unchecked -> RuntimeExceptions and subtypes
    //checked -> All except RuntimeException



    public void processData(String data) throws Exception{

        System.out.print("A");
        if(data.equals("")){
            System.out.print("B");
            //there is a problem
            throw new Exception("data cannot be empty");

        }else{

            System.out.println("Data is " + data.length() + " chars long");

        }

    }



}
