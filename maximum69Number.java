class maximum69Number {
    public int maximum69Number (int num) {
        List<Integer> list=new ArrayList<>();
        while(num!=0){
            int rem =num%10;
            list.add(rem);
            num/=10;
        }
        int n=list.size();
        for(int i=n-1;i>=0;i--){
            if(list.get(i)==6){
            list.set(i,9);
            break;
            }
        }
        // int res=0;
        for(int i=n-1;i>=0;i--){
            num=num*10+list.get(i);
        }
        return num;
    }
}