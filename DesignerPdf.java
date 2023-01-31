 public static int designerPdfViewer(List<Integer> h, String word) 
    {
        char[] a =
        { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
        'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int max     = 0;
        int count   = word.length();
        for (int i = 0 ; i < word.length(); i++)
        {
        for (int y = 0; y < a.length; y++)
        {

        if (a[y] == word.charAt(i))
        {
        if (max < h.get(y))
            {
            max = h.get(y);
            }
        }
        }
        }

        return max *count;

    }