public class TestDemo28 {
    public static void main(String[] args) {
        //一般验证码包含 大写字母、小写字母和0~9的数字。我随机生成这些字符组成一个字符串就是验证码
        //每一个字符都有一个编码值对应，这个对应关系就是ASCII码表
        /*
        * 查询ASCII编码，常见字符和整数的对应关系如下
        *   'a'~'z'     97~122     26个
        *   'A'~'Z'   65~90        26个
        *   '0'~'9'   48~57        10个
        */

        //定义一个char[]用来存储所有的字符
        char[] chs=new char[62];
        int index=0;//索引从0开始

        //把'a'~'z'的所有小写字母，存储到数组中
        for(char i='a';i<='z';i++){
            chs[index]=i;
            index++;
        }

        //把'A'~'Z'的所有大写字母，存储到数组中
        for(char i='A';i<='Z';i++){
            chs[index]=i;
            index++;
        }

        //把'0'~'9'的所有数字字符，存储到数组中
        for(char i='0';i<='9';i++){
            chs[index]=i;
            index++;
        }

        //再从chs数组中随机产生4个字符，组成一个字符串，就是随机的验证码
        Random r=new Random();
        String str=""; //一个空的字符串，用于验证码的拼接
        for (int i = 0; i < 4; i++) {
            //随机产生一个索引
            int j=r.nextInt(chs.length);
            str+=chs[j];
        }

        //最终str就是验证码
        System.out.println(str); 
    }
}
