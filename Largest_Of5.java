package impjava_Progs_Yellowpdf;

public class Largest_Of5 {
	public static void main(String[] args) {
	
		int  a=25, b=12,c=40,d=90,e=88;
  int res = (a>b)&&(a>c) ? a :  (b>c) ? b: c;
  int  res1 = (res> d) ?  res : (d>e) ? d : e;
  System.out.println(res);
  System.out.println(res1);
	}

}
