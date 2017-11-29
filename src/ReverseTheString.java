public class ReverseTheString {
    public static String reverseWords(String a) {

        StringBuilder sb = new StringBuilder();
        String[] array = a.split(" ");

        for(int i = array.length-1 ; i >= 0; i--){
            if(!array[i].equals("")){
                if(i != 0){
                    sb.append(array[i]).append(" ");
                }
                else {
                    sb.append(array[i]);
                }
            }
        }

        return sb.toString().trim();

    }

    public static void main(String[] args) {
        System.out.println(reverseWords("This is a test String"));
    }

}
