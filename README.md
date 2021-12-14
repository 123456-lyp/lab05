## 一、实验目的
掌握字符串String及其常用方法的使用

## 二、实验要求
&emsp;&emsp;有《长恨歌》古诗词，在经某程序处理后，被删去了非汉字部分，如标点符号、回车换行等。现请设计程序恢复。

&emsp;&emsp;要求如下：
1. 每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”；
2. 允许提供输入参数，统计古诗中某个字或词出现的次数。



## 三、实验过程
1. 首先思考如何实现分词（即添加标点以及换行），我通过循环整个字符串，每7个字节获取一次，然后将标点与其拼接后组成新的带标点换行的字符串。
2. 其次是查词功能，通过indexOf()函数，定位到第一次出现词语位置，然后通过substring()函数截取第一次出现后的字符串，继续循环查找，直至没有为止（indexOf()==-1）。1. 首先思考如何实现分词（即添加标点以及换行），我通过循环整个字符串，每7个字节获取一次，然后将标点与其拼接后组成新的带标点换行的字符串。
2. 其次是查词功能，通过indexOf()函数，定位到第一次出现词语位置，然后通过substring()函数截取第一次出现后的字符串，继续循环查找，直至没有为止（indexOf()==-1）。

## 四、主要代码
1. 设计标准古诗格式
```java
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
```

2. getCount 函数统计某词出现的次数
```java
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
```

## 五、实验感想
&emsp;&emsp;通过本次实验,掌握了字符串String及其常用方法的使用。了解了StringBuffer类的使用,其方法也可以掌握，学会了
indexOf、substring等方法的使用场景和条件。
