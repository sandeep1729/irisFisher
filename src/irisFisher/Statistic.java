/*#############################################################################################
  #                                                                                           #
  #      Program for mean, median, variance, 25 and 75 percentile of                          #
  #      given Iris fisher data. and to display histogram of the value                        #
  #                                                                                           #
  #                                                                                           #
  #                                                                                           #
  #############################################################################################     
 */ 
package irisFisher;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
	

	 
	public class Statistic {
	 
	  public static void main(String[] args) {
	 
		Statistic obj = new Statistic();
		obj.run();
		


	  }
	  
	 
	  public void run() {
		  
		int i=0;
		String File1 = "/Iris/Iris-setosa.csv"; //reading the file location
		BufferedReader br1 = null;
		String line1 = "";
		String Split1 = ",";
		
		String File2 = "/Iris/Iris-versicolor.csv";
		BufferedReader br2 = null;
		String line2 = "";
		String Split2 = ",";
		
		String File3 = "/Iris/Iris-virginica.csv";
		BufferedReader br3 = null;
		String line3 = "";
		String Split3 = ",";
		
		String[] iris1 = null;
		String[] iris2= null;
		String[] iris3=null;
		//int len=0;
		float setosa_SL[]= new float[150]; //allocation of float arrays to store the data available in fisher data
		float setosa_SW[]= new float[51];
		float setosa_PL[]= new float[51];
		float setosa_PW[]= new float[51];
		

		float versicolor_SL[]= new float[51];
		float versicolor_SW[]= new float[51];
		float versicolor_PL[]= new float[51];
		float versicolor_PW[]= new float[51];
		

		float virginica_SL[]= new float[51];
		float virginica_SW[]= new float[51];
		float virginica_PL[]= new float[51];
		float virginica_PW[]= new float[51];
		
		int secount=0;
		int vecount=0;
		int vicount=0;
			
		try {
	 
			br1 = new BufferedReader(new FileReader(File1));
			while ((line1 = br1.readLine()) != null)
			{	 
			    //reading the file and storing them in the array
				iris1 = line1.split(Split1);
 
				setosa_SL[i]=Float.parseFloat(iris1[0]);
				setosa_SW[i]=Float.parseFloat(iris1[1]);
				setosa_PL[i]=Float.parseFloat(iris1[2]);
				setosa_PW[i]=Float.parseFloat(iris1[3]);
				
				secount=i++;
				
			
			}
			i=0;
			
			br2 = new BufferedReader(new FileReader(File2));
			while ((line2 = br2.readLine()) != null)
			{	 
			   
				iris2 = line2.split(Split2);
				
				versicolor_SL[i]=Float.parseFloat(iris2[0]);
				versicolor_SW[i]=Float.parseFloat(iris2[1]);
				versicolor_PL[i]=Float.parseFloat(iris2[2]);
				versicolor_PW[i]=Float.parseFloat(iris2[3]);				
				
				vecount=i++;
				
			}
			i=0;
			
			br3 = new BufferedReader(new FileReader(File3));
			while ((line3 = br3.readLine()) != null)
			{	 
			  
				iris3 = line3.split(Split3);
				
				virginica_SL[i]=Float.parseFloat(iris3[0]);
				virginica_SW[i]=Float.parseFloat(iris3[1]);
				virginica_PL[i]=Float.parseFloat(iris3[2]);
				virginica_PW[i]=Float.parseFloat(iris3[3]); 
				
				
				vicount=i++;
				
			}
			//}
			
//			System.out.println("Sepal Length"+"Sepal Width"+"Petal Lenght"+"Petal Width");
//			for(i=0;i<50;i++)
//			{
//				System.out.println(setosa_SL[i] +"\t"+versicolor_SL[i]+"\t" +virginica_SL[i] +"\t"+
//						setosa_SW[i] +"\t"+versicolor_SW[i]+"\t" +virginica_SW[i]  +"\t"+
//								setosa_PL[i]+"\t" +versicolor_PL[i]+"\t" +virginica_PL[i] + "\t"+
//									setosa_PW[i]+"\t" +versicolor_PW[i]+"\t" +virginica_PW[i] + " "
//				
//					
//						);
//				
//			}

			for(i=0;i<200;i++)
				System.out.print("#");
			
			System.out.print("\n");
			
			//************************
		
			//************************
	
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br1 != null) {
				try {
					br1.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		Statistic s =new Statistic();
		
		System.out.println("\n \n\t######"+"Setosa Sepal Length#######");
		s.calculationMean(setosa_SL, secount);
		

		System.out.println("\n\t######"+"Setosa Sepal Width#######");
		s.calculationMean(setosa_SW, secount);
		

		System.out.println("\n\t#####"+"Setosa Petal Length#######");
		s.calculationMean(setosa_PL, secount);
		

		System.out.println("\n\t######"+"Setosa Petal Width#######");
		s.calculationMean(setosa_PW, secount);
		
		
		System.out.println("\n\t######"+"Versicolor Sepal Length#######");
		s.calculationMean(versicolor_SL, vecount);
		

		System.out.println("\n\t######"+"Versicolor Sepal Width#######");
		s.calculationMean(versicolor_SW, vecount);
		

		System.out.println("\n\t######"+"Versicolor Petal Length#######");
		s.calculationMean(versicolor_PL, vecount);
		

		System.out.println("\n\t######"+"Versicolor Petal Width#######");
		s.calculationMean(versicolor_PW, vecount);
		
		
		System.out.println("\n\t######"+"Virginica Sepal Length#######");
		s.calculationMean(virginica_SL, vicount);
		

		System.out.println("\n\t######"+"Virginica Sepal Width#######");
		s.calculationMean(virginica_SW, vicount);
		

		System.out.println("\n\t######"+"Virginica Petal Length#######");
		s.calculationMean(virginica_PL, vicount);
		

		System.out.println("\n\t#######"+"Virginica Petal Width#######");
		s.calculationMean(virginica_PW, vicount);
		
		

		
		
		System.out.println("Done");
	  }
	
	  
	  float x=0;
	  float numb[]=new float[51];
		public void calculationMean(float[] z, int total)
		{
			Statistic p=new Statistic();
	
			total=total+1;
					
			int n=0;
			//float x;
			float m=0;
			float v=0;
			
			//int total=0;
			int perc25;
			int perc75;
			int j=0;
			
			
			for(int i=0;i<=total;i++){
			float t = z[i];//type casted to float
			x=t+x;
			
			numb[j]=t;	
			j++;
		}
		m=x/total; //calculating average
		x=0;
		System.out.println("\n\t\t"+"average=" +m);
	
		Arrays.sort(numb); //for sorting the array
	
		// median calculation
		if(total%2==0)
		{
			System.out.println("\t\t"+"median="+((numb[(total/2)-1])+(numb[total/2]))/2.0);			
		}
		else
		{
			System.out.println("\t\t"+"median="+(numb[total/2]));
		}
		
		
		for(n=1;n<=total;n++)//variance calculation
		{
			v+=(m-numb[n])*(m-numb[n]);			
		}
		
		System.out.println("\t\t"+"variance="+v/((n-1)));

		
		perc25=total*25/100;//to find the 25 percentile
		Arrays.sort(numb);
		System.out.println("\t\t"+"25 percentile=" +numb[perc25]);
		
		
		perc75=total*75/100;//to find the 75 percentile
		Arrays.sort(numb);
		System.out.println("\t\t"+"75 percentile=" +numb[perc75]);
		System.out.println("#####################################################################################");
		p.histogram(z, total, numb[total]);
				
		n=0;
		m=0;
		v=0;
		}	
		
			
		  
		
	public void histogram(float h[],int total, float max)
	{	
		//For printing histogram 
		System.out.println("\n###############################****Histogram****#################################");
		
		//Arrays.sort(h);
//		System.out.println(h[0]+h[50]);
//		System.out.println(total);
		
		//System.out.println(max);
		float temp=max/10;
		float tem=temp;
		System.out.print("  ");
		
		for(int i=0;i<10;i++)
		{
			System.out.print("|");
			System.out.printf("%.2f", temp); //printing the index of histogram
			System.out.print("|");
			temp=tem+temp;			
		}
		System.out.print("\n");
		for(int i=0;i<total;i++)
			
		{	if(i<9)
			System.out.print(" ");
			
			System.out.print(i+1);
			for(float j=temp;j<=h[i]*10*temp/max;j=j+temp) // to print values accordingly making them to 10 distributions
			{
				//System.out.print(" "+" * "+"  ");		
				System.out.print("******");
			}
			System.out.print(""+"\n");
			
		}
		
		
		System.out.println("#################################################################################################");
	
		
	}
	
	
	}
	
	  
	  
	  