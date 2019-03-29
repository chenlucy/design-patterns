package com.corey.proxy.subject;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.File;
import java.util.Iterator;
import java.util.List;

/**
 * @Describe 类描述，功能介绍
 * @Author chenlu
 * @Version V1.0
 * @Date 2019/2/20.
 */
public class Test {
    public static void main(String[] args) throws Exception{
//        ConcreteSubject s=new ConcreteSubject();
//        s.setSubjectState("上天了");
//        s.add(new ConcreteObserver(s,"X"));
//        s.add(new ConcreteObserver(s,"Y"));
//        s.add(new ConcreteObserver(s,"Z"));
//        s.add(new ConcreteObserver(s,"A"));
//        s.add(new ConcreteObserver(s,"B"));
//        s.add(new ConcreteObserver(s,"C"));
////        s.notified();
//        JSONObject params = null;
//        List<Object> list = s.getList();
//        JSONArray ss=new JSONArray(list);
//        JSONArray sss=ss.getJSONArray(2);
//        System.out.println(sss);

//        File file = new File("C:\\woekfile\\aa\\test.txt");
//        if (file.exists()) { //来判断这是不是一个文件。
////            file.isDirectory(); //来判断这是不是一个文件夹。
//            System.out.println(file.getName());
//        }

        String testFilePath = "C:\\woekfile\\ff\\ee";
        File testFile = new File(testFilePath);
        if(!testFile .exists()) {
            testFile.mkdirs();
            System.out.println("测试文件夹不存在");
        }

//        File testFile2 = new File(testFilePath);
//        if(!testFile .exists()) {
//            testFile2.createNewFile();
//            System.out.println("测试文件不存在");
//        }

    }


    public static JSONArray getParam(JSONObject params) {

        JSONArray jsonParam = new JSONArray();
        JSONObject jsonObject;
        Iterator<String> it = params.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next();
            String value = params.getString(key);
            jsonObject = new JSONObject();
            jsonObject.put("name", key);
            jsonObject.put("value", value);
            jsonParam.add(jsonObject);
        }

        return jsonParam;
    }

    }
