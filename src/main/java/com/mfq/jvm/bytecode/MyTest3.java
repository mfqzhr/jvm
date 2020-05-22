package com.mfq.jvm.bytecode;

import sun.security.pkcs11.Secmod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/5/22 9:48
 * @description：
 * @modified By：
 * @version: $
 */
public class MyTest3 {
    public void test() {
        try {
            InputStream is = new FileInputStream("test.txt");

            ServerSocket serverSocket = new ServerSocket(9999);
            serverSocket.accept();
        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        } catch (Exception e) {


        } finally {
            System.out.println("finally");
        }
    }


}
