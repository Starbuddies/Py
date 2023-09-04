
Import java.util.Scanner;
public class KnapsackDP
{
static finalintMAX=20;//max.no.ofobjects static
intw[]; // weights 0 ton-1
static int p[]; // profits 0 ton-1
static int n; // no. ofobjects
static int M; // capacity of Knapsack
static int V[][]; // DP solution process-table
staticint Keep[][]; // to get objects in optimal solution
public static void main(String args[])
{
w = new int[MAX];
p = new int[MAX];
V = new int [MAX][MAX];
Keep = new int[MAX][MAX];
intoptsoln;
ReadObjects();
for (int i= 0; i<= M;i++)
V[0][i] = 0;
for (int i= 0; i<= n;i++)
V[i][0] =0;
optsoln= Knapsack();
System.out.println("Optimal solution= "+ optsoln);
}
staticint Knapsack()
{
int r; // remaining Knapsack capacity
for (int i= 1; i<= n; i++)
for (int j= 0; j<= M; j++)
if((w[i] <= j) && (p[i] + V[i- 1][j- w[i]] > V[i- 1][j]))
{else
V[i][j] = p[i] + V[i- 1][j - w[i]];
Keep[i][j] = 1;
V[i][j] = V[i- 1][j];
Keep[i][j] =0;
//FindtheobjectsincludedintheKnapsack r
=M;
System.out.println("Items = ");
for (int i= n; i> 0; i--) // start from Keep[n,M]
if
(Keep[i][r] == 1)
{ System.out.println(i + "");
r = r -w[i];
}
System.out.println();
returnV[n][M];
}
static void ReadObjects()
{
Scanner scanner = new Scanner(System.in); System.out.println("Knapsack
Problem - Dynamic Programming Solution: ");
System.out.println("Enterthemaxcapacityofknapsack:");M=
scanner.nextInt();
System.out.println("Enternumberofobjects:");n=
scanner.nextInt();
System.out.println("Enter Weights:");for
(inti= 1; i<= n;i++)
w[i] = scanner.nextInt();
System.out.println("Enter Profits:");for
(inti= 1; i<= n; i++)
p[i] = scanner.nextInt();
scanner.close();
}
}
