package StringsTasks;
import java.util.Scanner;


public class HomeWork6 {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String args[]){
		System.out.println("Enter word or sentences: ");
		String sentences = scanner.nextLine();
		/**
		System.out.println(sentences.toLowerCase());
		System.out.println(sentences.toUpperCase());
		char[] result = sentences.toCharArray();
		for(int i=0; i<result.length;i++){
			if(i==0){
				result[i]=Character.toUpperCase(result[i]);
			}else if(result[i]==' '){
				result[i+1]=Character.toUpperCase(result[i+1]);
			}
		}
		System.out.println(result);
		System.out.println("Count letters "+sentences.replace(" ","").length());
		int count =0;
		char stringes[] = new char[sentences.length()];
		for(int i=0; i<sentences.length();i++){
			stringes[i]=sentences.charAt(i);
			if((i>0)&&(stringes[i]!=' ')&&(stringes[i-1]==' ')||(stringes[0]!=' ')&&(i==0)){
				count++;
			}
		}
		System.out.println("Count of words "+count);
		System.out.println("Letter removal "+sentences.replaceAll("e",""));
**/
		String firstNumber = "";
		String secondNumber = "";
		String thirdNumber = "";
		String lastNumber = "";
		int val2=0;
		int val1=0;
		int val3=0;
		int val4=0;
		String value = sentences.replaceAll("([A-Z.a-z])","").trim();
		System.out.println(value);
		for(int i=0;i<2;i++){
			 firstNumber += value.charAt(i);
		}
		for(int i=2;i<4;i++){
			secondNumber += value.charAt(i);
		}
		for(int i=4;i<6;i++){
			thirdNumber += value.charAt((i));
		}
		for(int i=7;i<13;i++){
			lastNumber += value.charAt(i);
		}
		val1 = Integer.parseInt(firstNumber);
		val2 = Integer.parseInt(secondNumber);
		val3 = Integer.parseInt(thirdNumber);
		val4 = Integer.parseInt(lastNumber);
		int result = val1*val2*val3;
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		System.out.println(val4);
		System.out.println("result: "+result);
		if(result==val4){
			System.out.println("True");
		}else{
			System.out.println("False");
		}

/**		System.out.println("Square word patterns: ");
		StringBuffer stringInBuf;
		for(int i=0; i<sentences.length();i++){
			stringInBuf = new StringBuffer();
			int j=i;
			int k=0;
			for(int kn=j;kn<sentences.length();kn++){
				stringInBuf.insert(k,sentences.charAt(j));
				k++;
				j++;
			}
			j=0;
			while(j<i){
				stringInBuf.insert(k,sentences.charAt(j));
				j++;
				k++;
			}
			System.out.println(stringInBuf);
		}
 **/
	}
}
