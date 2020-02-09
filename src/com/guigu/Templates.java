package com.guigu;


import com.guigu.bean.Custom;

import java.util.ArrayList;

/**
 * Created by 朱翔 on 2020/2/8.
 */
/*
idea 代码模板所处的位置：setting -editor-live templates(更快一些)/postfix completion
live templates可以修改，本人把idea里main函数的快捷键psvm修改成main了.
*/
public class Templates {
    //模板六：prsf
    private static final Custom cu = new Custom();
    //变形:psf/psfi/psfs
    public static final String s = "aaa";
    /*模板修改 进入live templates修改 以psfi为例
    初始效果：public static final int
    修改之后：public static final int $VAR1$ = $VAR2$;
    $END$*/
    public static final int i = 0;
    /*模板自定义 进入live templates 点击+ , 点击Template Group ,
    输入name ,点击+,点击live templates,开始自定义
    注意Define选择java或者其他
    */

    //模板一：main
    public static void main(String[] args) {
        //模板二：sout
        System.out.println();
        //变形：soutp/soutm/soutv/xxx.sout
        System.out.println("args = [" + args + "]");//参数
        System.out.println("Templates.main");//方法名
        int ii = 1;
        System.out.println("ii = " + ii);//就近变量
        System.out.println(222);//xxx.sout
        //模板三：fori
        String[] arr = new String[]{"001", "002", "003"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形:iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
        }
        //模板四：list.for
        ArrayList<String> list = new ArrayList();
        list.add(0, "qqq");
        list.add(1, "www");
        list.add(2, "eee");
        for (String s : list) {
            System.out.println(s);
        }
        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //变形：list.forr 反向遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }
        //模板五：ifn
        if (list == null) {

        }
        //变形：inn
        if (list != null) {

        }
        //变形：xxx.nn/xxx.null


    }
}
