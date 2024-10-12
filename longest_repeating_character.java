class longest_repeating_character
{
    public static void main(String args[])
    {  //Here we have to find the longest sub array that contains minimum k characters replacement
      String str="AAABBBCCB";int k=2;
      System.out.println(longestRepeatingChar(str,k));
    }

     static int longestRepeatingChar(String str,int k) 
     {
        char[] arr= str.toCharArray();
        int l=0,r=0,maxlen=0,maxf=0;
        int[] map=new int[26];

        while(r<str.length())
        {  map[arr[r] - 'A']++;
           maxf=Math.max(maxf,map[arr[r] - 'A']);   
           if((r-l+1)-maxf > k)
           {
            map[arr[l]-'A']--;
            l++;
           }
           maxlen=Math.max(maxlen,r-l+1);
           r++;
        }

      return maxlen;  
     }
}