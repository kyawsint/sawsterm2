public class StringBuffer_eg
{
    public String joinWords(String[] words)
    {
        StringBuffer sb=new StringBuffer();
        for(int i=0; i<words.length;i++)
        {
            if(i>0) sb.append("*");
            String word=words[i].trim();
            sb.append(word);
        }
        return sb.toString();
    }

    public static void main(String args[])
    {
        StringBuffer_eg sbe=new StringBuffer_eg();
        String[] word={"asdf qwer zxcv","123 456 789"};
        System.out.println(sbe.joinWords(word));
    }
}
