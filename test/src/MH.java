public class MH {
    public static String move(String strg){
        String ch="";
        for(int i=0;i<strg.length()-1;i++){
            ch=ch+(char)strg.charAt(i);
        }
        return strg.charAt(strg.length()-1)+ch;
    }
    public static void main(String[] args) {
        System.out.println(move("xxxyz"));
    }
}
