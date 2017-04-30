import java.util.Scanner;
public class main {
	public static void main(String[] args)
	{
		Scanner in =new Scanner(System.in);
		System.out.println("podaj liczbe ktora bedzie szerokoscia i dlugoscia tablicy");
		int x  =in.nextInt();//podanie szerokosci i dlugosci tablicy 2d
		int s =(x/2);
	//utworzenie tablicy 		
		
		int tab[][] =new int [x][x]; 
		int k =1;
		
		//algorytm wype³niaj¹cy		
			
	for (k=1;k<=s; k=k+2){	
		for(int  i =0; i<x;i++)
			{
			for(int j= 0;j<x;j++)
			{
			
				if(((i==s+k) || (i==s-k) ||(j==s+k) || (j==s-k)) && ((Math.abs(s-i)<=k) && (Math.abs(s-j)<=k))) 
				
				{

					
					tab[i][j]=1;
					
				}	
				
				
				
			}		
				
				
				
				
			/*if (j==0||i==0||i==(x-1)||j==(x-1)) 
				{
					
					tab[i][j]=1;
				}
				if((j==0||i==0||i==(x-1)||j==(x-1)))
				{
					
				}
				
		    /*      if(j==2||i==2||i==(x-(tab.length-4))||j==(x-(tab.length-4))) 
				{
					tab[i][j]=1;
				}
			*/
				
				}

			}

		
		
		
//drukowanie		
		
		for(int  i =0; i<tab.length;i++)
		{
			for(int j= 0;j<tab[i].length;j++)
			{
				System.out.print(" "+tab[i][j]);
			}
			System.out.println(" ");   
			
		}
	}
		
		
		
		
		
	}

