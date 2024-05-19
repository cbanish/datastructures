public class StringManipulations {
    public static int countVowels(String input){
        String vowels="aeiou";
        int count=0;
        char[] charArray = input.toCharArray();
        for(char ch:charArray){
            if(vowels.indexOf(ch) !=-1){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String vowelCheck="Beautiful";
        System.out.println("Vowels count is "+countVowels(vowelCheck));
    }
}
