import java.util.Scanner;
class vowel{
	int cout=0;
	void countvowel(){
		System.out.println("Enter the string, type quit to exit:");
		int len,a=0,e=0,i1=0,o=0,u=0,n=1;
		char ch;
		String str2="quit";
		while(n!=0){
			Scanner str= new Scanner(System.in);
			String str3=str.nextLine();
			String str1=" "+str3;
			len=str1.length();
			for(int i=0;i<len;i++){
			
				ch=str1.charAt(i);
				int j=i;
				if(ch==' '){
					j++;
					String str4;
					str4=str1.substring(j,j+4);
					boolean result=str4.contentEquals(str2);
					if(result==true){
						n=0;
						break;
					}
				}
			
				if(ch=='a'||ch=='A')
					a++;
				if(ch=='e'||ch=='E')
					e++;
				if(ch=='i'||ch=='I')
					i1++;
				if(ch=='o'||ch=='O')
					o++;
				if(ch=='u'||ch=='U')
					u++;
			}
			System.out.println("A or a = "+a+"\nE or e = "+e+"\nI or i = "+i1+"\nO or o = "+o+"\nU or u = "+u+"\nTotal Vowel = "+(a+e+i1+o+u));
		}
	}
	
}
class demo{
	public static void main(String args[]){
		vowel v=new vowel();
		v.countvowel();
	}
}
