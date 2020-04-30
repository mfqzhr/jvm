package com.mfq.jvm.classloader;

import java.io.*;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/29 11:53
 * @description：
 * @modified By：
 * @version: $
 */
public class MyTest16 extends ClassLoader {
    private String classLoaderName;
    private String path;
    private final String fileExtension = ".class";

    public MyTest16(String classLoaderName) {
        this.classLoaderName = classLoaderName;
    }

    public MyTest16(ClassLoader parent, String classLoaderName) {
        super(parent);
        this.classLoaderName = classLoaderName;
    }

    public void setPath(String path) {
        this.path = path;
    }

    private byte[] loadClassData(String name) {
        InputStream is = null;
        byte[] data = null;
        ByteArrayOutputStream baos = null;
        try {
            name = name.replace(".", "/");
            is = new FileInputStream(new File(this.path + name + this.fileExtension));
            baos = new ByteArrayOutputStream();
            int ch = 0;
            while (-1 != (ch = is.read())) {
                baos.write(ch);
            }
            data = baos.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
                baos.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return data;

    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] data = this.loadClassData(name);
        return super.defineClass(name, data, 0, data.length);
    }


    public static void test(ClassLoader classLoader) {
        try {
            Class<?> aClass = classLoader.loadClass("com.mfq.jvm.classloader.MyTest1");
            Object o = aClass.newInstance();
            System.out.println(o);
            System.out.println(o.getClass().getClassLoader());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MyTest16 myTest16 = new MyTest16("loader1");
        test(myTest16);

    }

}
