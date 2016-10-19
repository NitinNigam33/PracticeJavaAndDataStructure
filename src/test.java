class test {
    public static void main (String [] args) {
        int i = 1;
        int j = 1;
        int x = 0;
        while (x < 5) {
            i = i + x;
            j = i*j;
            x = i + j;
            System.out.println(i + " " + i + j + x);
        }
    }
}