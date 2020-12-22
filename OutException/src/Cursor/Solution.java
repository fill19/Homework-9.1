package Cursor;

public class Solution {
    public static void main(String[] args) {


        StringBuilder error = new StringBuilder();

        try{
            while(true){
                error.append("Error");
            }
        } catch (OutOfMemoryError crash){
            System.out.println(crash.getMessage());
            System.out.println( crash);

        }
    }
}
