import java.util.Arrays;

class Solution001 {
    public boolean Solution001(String[] phone_book) {
        boolean answer = true;

        Arrays.sort(phone_book);

        for(int i = 0; i < phone_book.length - 2; ++i){
            int j = i + 1;

            if(phone_book[j].startsWith(phone_book[i])){
                answer = false;
                break;
            }
        }

        return answer;
    }
}
