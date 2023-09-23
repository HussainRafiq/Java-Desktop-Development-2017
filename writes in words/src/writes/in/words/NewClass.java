package writes.in.words;

class wn {
    static int jiven = 0,ni;                
    public static String k(int no){
        String t="thousand";
        String ja="";
        String na="";
        String sa="";
String ga="";
        String la="";        
        
String h="hundred";
String te="ty";
        for (int i=1; i<=4; i++){
if(i==1){
	ni=no/1000;
  
	   for (int j = 1; j < 10; j++) {
                    String ones[]={"one","two","three","four","five","six","seven","eight","nine"};
               if (ni==j) {
                na=ones[j-1]+" "+t+" ,";   
               }
                }
}
if(i==2){      String twos[]={"one","two","three","four","five","six","seven","eight","nine"};
    
	ni=no/100%10;
        for (int j = 1; j < 10; j++) {
        if(ni==j){
            
                la=twos[j-1]+" "+h+" ,";   
            
        }
    }
        }
if(i==3){
	ni=no/10%10;
	if(ni==1){
		jiven=323257;
		ni=no%100;
                String th[]={"ten","eleven","twelve","thirteen","forteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
                for (int j = 10; j < 20; j++) {
                if(ni==j){
                    sa=th[j-10];
                }
            }
	}
        else{
            String fo[]={"twenty ","thirty ","forty ","fifty ","sixty ","seventy ","eighty ","ninety "};
            for (int j = 2; j < 10; j++) {
                if (ni==j) {
                    ga=fo[j-2];
                }
            }
        }        }
if(i==4){
	if(jiven!=323257){
	int ni=no/1%10; String fi[]={"one","two","three","four","five","six","seven","eight","nine"};
        
            for (int j = 1; j < 10; j++) {
                if(ni==j){
                    ja=fi[j-1];
                }
            }
        }
}
}
        return na+la+sa+ga+ja;
    }
}
