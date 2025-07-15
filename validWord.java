class validWord {
    public boolean isValid(String word) {

        if(word.length()<3)
        return false;
        boolean isvowel=false;
        boolean isconsonant=false;
        
        for(char ch: word.toCharArray())
        {
            if(Character.isLetter(ch))
            {

                ch=Character.toLowerCase(ch);

                if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
                {
                    isvowel=true;
                }

                else
                {
                    isconsonant=true;
                }

            }

            else if(! Character.isDigit(ch)){
                return false;
            }
            
        }
        return isvowel && isconsonant;



        
    }
}