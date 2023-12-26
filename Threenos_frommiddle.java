package impjava_Progs_Yellowpdf_ifelse;

public class Threenos_frommiddle {
public static void main(String[] args) {
	int a=100,b=10,c=12;
  int middle_number = middleNumber(a, b,c);
  System.out.println(" The middle number " +middle_number );
	
}
	public static int middleNumber(int a, int b, int c) {
		if((a>=b && a<=c)||(a<=b && a>=c)){
			return a;
		} else if((b>=a && b<=c) || (b<=a && b>=c)){
			return b;
		} else {
			return c;
		}
  }
}
