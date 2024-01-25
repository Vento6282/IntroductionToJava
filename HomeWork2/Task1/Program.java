package IntroductionToJava.HomeWork2.Task1;

public class Program {
    public static void main(String[] args) {
        String query = "select * from students where ";
        String params = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
        System.out.println(answer(query, params));

    }
    public static StringBuilder answer(String query, String params){
        params = params.replace("\"", "");
        params = params.replace(" ", "");
        params = params.replace(":", ",");
        params = params.substring(1);
        params = params.substring(0,params.length()-1);
        System.out.println(params);  
        StringBuilder sb = new StringBuilder(query);
        String[] arr = params.split(",");
        for (int i = 0; i < arr.length; i += 2){
            if (!arr[i+1].equals("null"))
            {
                if (sb.length() == query.length()){
                    String str = "\'" + arr[i]  + "\'=\'" + arr[i+1] + "\'";
                    sb.append(str);
                } else {
                    String str = "and \'" + arr[i]  + "\'=\'" + arr[i+1] + "\'";
                    sb.append(str);
                }
            }
        }
        return sb;
    }
}
