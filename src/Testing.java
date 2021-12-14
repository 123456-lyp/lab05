import java.io.File;
import java.util.Scanner;

public class Testing {
    public static String add_bd(){    //加标点
        System.out.println("请输入古诗");
        Scanner in = new Scanner(System.in);
        String poetry = in.nextLine(); //分词前
        String poem = "";   //分词后
        int j=0;
        for(int i =0;i<poetry.length();i+=7){
            String a = poetry.substring(i,i+7);
            boolean b = j % 2 == 0;//判断奇偶，第几次分词
            //System.out.println(b);
            if(b == true){
                poem = poem + a+"，";
                //System.out.println(poem);
            }
            else{
                poem = poem + a+"。\n";
                //System.out.println(poem);
            }
            j++;
        }
        System.out.println(poem);
        return poem;
    }

    public static void find_word(){   //查词
        Scanner in = new Scanner(System.in);
        System.out.println("是否需要分词（请输入“是”或者“否”）");
        String a = in.next();
        String needFind = "";
        if(a.equals("是")){
            needFind = Testing.add_bd();
        }
        else{
            System.out.println("请输入古诗");
            needFind = in.next();
        }
        System.out.println("请输入想要检测的单词");
        String word = in.next();
        int i = 0;
        while (needFind.indexOf(word) != -1 ){
            i++;
            System.out.println(word+"出现第"+i+"次,位置在" + needFind.indexOf(word));
            needFind = needFind.substring(needFind.indexOf(word)+word.length());
            System.out.println("剩余的文字：" + needFind);
        }
        System.out.println(word+"一共出现了"+i+"次");
    }

    public static void in_out()throws Exception{
        File f = new File("d:" + File.separator + "a.txt");
    }


    public static void main(String[] args){
        add_bd();
        //find_word();
    }
}