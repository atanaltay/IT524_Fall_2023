package model2;

public class ManCLass {


    public static void main(String[] args) {

        String[] data = {"jack loves","football","henry","java rules","python is cool"};


        AnalyzerTool tool = new AnalyzerTool();

        tool.analyzeData(new StringAnalyzer() {
            @Override
            public boolean analyze(String s, String check) {
                return s.startsWith(check);
            }
        }, data, "j");


        tool.analyzeData(new StringAnalyzer() {
            @Override
            public boolean analyze(String s, String check) {

                return s.endsWith(check);
            }
        },data,"l");


        tool.analyzeData((s,c)->s.toLowerCase().startsWith(c),
                data,"java");




    }
}
