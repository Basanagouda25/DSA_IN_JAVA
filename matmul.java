import java.util.*;
public class matmul {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the rows and cols of Mat A:");
     int r1=sc.nextInt();
     int c1=sc.nextInt();
     System.out.println("Enter the rows and cols of Mat B:");
     int r2=sc.nextInt();
     int c2=sc.nextInt();
     int[][] m1= new int[r1][c1];
     System.out.println("Enter the values in Mat A:");
     for(int i=0; i<r1; i++){
        for(int j=0; j<c1; j++){
            m1[i][j]=sc.nextInt();
        }
    }
    int[][] m2= new int[r2][c2];
    System.out.println("Enter the values in Mat B:");
     for(int i=0; i<r2; i++){
        for(int j=0; j<c2; j++){
            m2[i][j]=sc.nextInt();
        }
    }
    int[][] r= new int[r1][c2];
     for(int i=0; i<r1; i++){
        for(int j=0; j<c1; j++){
            for(int k=0; k<c2; k++){
                r[i][j]+=(m1[i][k]*m2[k][j]);
            }
        }
    }
    System.out.println("The resultant Matrix:");
     for(int i=0; i<r1; i++){
        for(int j=0; j<c1; j++){
            System.err.print(+r[i][j]+" ");
        }
        System.out.println();
    }
    }
}