public class stringsearch {
    public static void main(String[] args) {
        String name ="Chaitanya";
        char target='c';
        System.out.println("Character found at index: " + search(name, target));
    }
    static boolean search(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(target==str.charAt(i)){
                return true; // Return the index of the found character
            }
        }
        return false; // Return -1 if the character is not found
    }
}
