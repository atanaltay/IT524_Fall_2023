package model2;

public class AnalyzerTool {

    public void analyzeData(StringAnalyzer analyzer,String[] data, String check){


        for (String str:data
             ) {

            System.out.println(analyzer.analyze(str,check));


        }



    }



}
