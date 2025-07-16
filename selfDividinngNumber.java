class selfDividingNumber {
    public boolean check(int i) {
        int num=i;
        while (num != 0) {
            
            int rem = num % 10;
            if (rem == 0 || i % rem != 0) {
                return false;
            }
            num = num / 10;
        }
        return true;

    }

    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (check(i)) {
                result.add(i);
            }
        }
        return result;
    }

}