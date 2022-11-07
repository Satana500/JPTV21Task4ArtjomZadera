public class Task4 {
    public static void main(String[] args) {
            int a=0;
        for(int i=1;i<=99;i++){
            if(i%2!=0)a++;
        }
        int[] Mas = new int[a];
        int count = 0;
        int result = 0;
        for(int i=1,b=0;i<=99;i++){
            if(i%2!=0){
                Mas[b]=i;
                result = result + Mas[b];
                System.out.print(Mas[b]+" ");
                b++;
                count = count + 1;
            } if(count==10){
                System.out.printf("%n");
                count=0;
            }
        }
        result = result / Mas.length;
        System.out.printf("Среднее арефметическое массива: %s%n", result);
        }
    }
