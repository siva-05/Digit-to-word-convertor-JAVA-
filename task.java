//Task-3
//Numbers beginning a sentence should be spelt out.
//Hyphenate all compound numbers from twenty-one through ninety-nine
//This program is only valid upto 4 digits (ie:0-9999)
// :)


import java.util.Scanner;

public class task {

    static int f;
    static void D1(String c){
        if(f==1)
            System.out.print("-");
        String arr[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        System.out.print(arr[Integer.parseInt(c)]);
    }


    static void D2(String c){
        String D2arr1[]={"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String D2arr2[]={"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        if(c.charAt(0)=='1'){
            System.out.print(D2arr1[c.charAt(1)-'0']+" ");
        }
        else{
            System.out.print(D2arr2[(c.charAt(0)-'0')-2]+"");
            if(c.charAt(1)!='0') {
                f = 1;
                D1(c.charAt(1) + "");
            }
        }
    }

    static void D3(String c) {
        D1(c.charAt(0) + "");
        System.out.print(" hundred ");
        if(!(c.charAt(1)=='0' && c.charAt(2)=='0')){
            if(c.charAt(1)=='0')
                D1(c.charAt(2)+"");
            else
                D2(c.substring(1,3));
        }
    }

    static void D4(String c){
        D1(c.charAt(0)+"");
        System.out.print(" thousand ");
        if(!(c.charAt(1)=='0' && c.charAt(2)=='0' && c.charAt(3)=='0')){
            if(c.charAt(1)=='0' && c.charAt(2)=='0')
                D1(c.charAt(3)+"");
            else if(c.charAt(1)=='0')
                D2(c.substring(2,4));
            else
                D3(c.substring(1,4));
        }

    }

    public static void main(String[] args) {
        f=0;
        Scanner in=new Scanner(System.in);
        String sentence=in.nextLine();
        String str[]=sentence.split(" ");
        int l=str[0].length();
        switch (l){
            case 1: {
                D1(str[0]);
                break;
            }
            case 2: {
                D2(str[0]);
                break;
            }
            case 3: {
                D3(str[0]);
                break;
            }
            case 4: {
                D4(str[0]);
                break;
            }
            default:{
                System.out.println("invalid :(");
            }
        }
        System.out.println(" ");
        for(int i=1;i<str.length;i++){
            System.out.print(str[i]+" ");
        }
    }
}


//Sample output
//5678
//five thousand six hundred seventy-eight