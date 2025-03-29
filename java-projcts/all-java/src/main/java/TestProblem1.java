import java.util.ArrayList;
import java.util.List;
public class TestProblem1 {
    public static void main(String [] arg ){
        String[] anagramList = {"eat", "tea", "ton", "ate", "not", "bat"};
        group(anagramList);
        /*int num = 23455;
        int[] arr = new int[(num+"").length()];
        int arrlen = arr.length;
        for(int i = 0; i < arrlen ; i++){
            int remainder = num % 10 ;
            int quotient = num / 10 ;
            arr[i] = remainder ;
            num = quotient ;
        }

        //for(int i = 0 ; arr; )
        for(int j = 0 ; j < arr.length ; j++)
            System.out.println( arr[j] );
         */
    }
     //aet , aet not aet not abt
/*    Input: ["eat", "tea", "ton", "ate", "not", "bat"]
    Output:
            [
            ["ate","eat","tea"],
            ["not","ton"],
            ["bat"]
            ]
 */

    public static List<List<String>> group(String[] strs) {
        List<List<String>> temp = new ArrayList<>() ;
        List<String> anagrampList = new ArrayList<>();
        for(String s : strs){
            String sorted = "";
            for(int i = 0 ; i < s.length(); i++) {
                char c = s.charAt(i);
            }
        }
        return  temp;
    }
}

/*
select cid, sum(oreramount) Tot_Ordr_amt from
customer left join order
on (cid = cid)
where 1=1 -- cid = 8
and date = to_date('')
group by cid
having sum(orderamout) >= 1000
order by  cid
*/
