// Задание 4.22
    public class  part_4_22  {
        public static void main(String[] args) {
            System.out.println("N     10*N     100*N      1000*N");
            System.out.println("  ");
            int N = 1;
            for (N=1; N<=5; N++){
                System.out.printf("%-6s %-8d %-10d %-2d%n", N, N*10, N*100, N*1000);
            }
        }
    }
